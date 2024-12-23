import os
import uuid

from django.http import HttpResponse, JsonResponse
from django.utils.timezone import now
from rest_framework import generics, status
from rest_framework.response import Response
from rest_framework.views import APIView

from bunyod1 import settings
from .serializers import UserCreateSerializer,UserUpdateSerializer
import xlsxwriter

from .models import User
from .serializers import UserSerializer


class GetAll(generics.ListCreateAPIView):
    queryset = User.objects.all()
    serializer_class = UserSerializer


class GetByID(generics.RetrieveUpdateDestroyAPIView):
    queryset = User.objects.all()
    serializer_class = UserSerializer


class CreateUser(APIView):
    def post(self, request):
        serializer = UserCreateSerializer(data=request.data)
        if serializer.is_valid():
            user = serializer.save()
            return Response({
                "id": user.id,
                "username": user.username,
                "email": user.email
            }, status=status.HTTP_201_CREATED)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)


class UserUpdateView(APIView):
    def get_object(self, user_id):
        try:
            return User.objects.get(id=user_id)
        except User.DoesNotExist:
            return None

    def put(self, request, user_id):
        user = self.get_object(user_id)
        if not user:
            return Response({"error": "User not found"}, status=status.HTTP_404_NOT_FOUND)

        serializer = UserUpdateSerializer(user, data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data, status=status.HTTP_200_OK)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)

    def patch(self, request, user_id):
        user = self.get_object(user_id)
        if not user:
            return Response({"error": "User not found"}, status=status.HTTP_404_NOT_FOUND)

        serializer = UserUpdateSerializer(user, data=request.data, partial=True)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data, status=status.HTTP_200_OK)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)

class UserDeleteView(APIView):
    def get_object(self, user_id):
        try:
            return User.objects.get(id=user_id)
        except User.DoesNotExist:
            return None

    def delete(self, request, user_id):
        user = self.get_object(user_id)
        if not user:
            return Response({"error": "User not found"}, status=status.HTTP_404_NOT_FOUND)

        user.delete()
        return Response({"message": "User deleted successfully"}, status=status.HTTP_204_NO_CONTENT)



def export_users_to_excel(request):
    # Fetch all users from the database
    users = User.objects.all()

    # Define the file path where the Excel file will be saved
    file_name = f'users_{str(uuid.uuid4())}.xlsx'
    file_path = os.path.join(settings.MEDIA_ROOT, 'excel_files', file_name)

    # Ensure the directory exists
    os.makedirs(os.path.dirname(file_path), exist_ok=True)

    # Create a new workbook and add a worksheet
    workbook = xlsxwriter.Workbook(file_path)
    worksheet = workbook.add_worksheet('Users')

    # Add headers to the first row
    worksheet.write('A1', 'ID')
    worksheet.write('B1', 'Username')
    worksheet.write('C1', 'Email')
    worksheet.write('D1', 'First Name')
    worksheet.write('E1', 'Last Name')
    worksheet.write('F1', 'Date Joined')
    worksheet.write('G1', 'Address')

    # Iterate over the users and write their data to subsequent rows
    row = 1  # Start from the second row (row 1) since row 0 is for headers
    for user in users:
        worksheet.write(row, 0, user.id)
        worksheet.write(row, 1, user.username)
        worksheet.write(row, 2, user.email)
        worksheet.write(row, 3, user.first_name)
        worksheet.write(row, 4, user.last_name)
        worksheet.write(row, 5, user.date_joined.strftime('%Y-%m-%d %H:%M:%S'))  # Format the date
        worksheet.write(row, 6, user.address)  # Format the date
        row += 1

    # Close the workbook
    workbook.close()

    # Return the file path in the response
    return JsonResponse({'file_path': file_path})
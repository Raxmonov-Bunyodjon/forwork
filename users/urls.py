from django.urls import path
from .views import GetAll, GetByID, CreateUser, UserUpdateView, UserDeleteView, export_users_to_excel

urlpatterns = [
    path('', GetAll.as_view(), name='get_all'),
    path('<int:pk>/', GetByID.as_view(), name='user-detail'),
    path('register/', CreateUser.as_view(), name='user-create'),
    path('edit/<int:user_id>/', UserUpdateView.as_view(), name='user-edit'),
    path('delete/<int:user_id>/', UserDeleteView.as_view(), name='user-delete'),
    path('export/', export_users_to_excel, name='export-users'),
]

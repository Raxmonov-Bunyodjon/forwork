import random
import uuid
from datetime import timezone

from django.core.management.base import BaseCommand
from django.contrib.auth import get_user_model
from faker import Faker

User = get_user_model()
fake = Faker()


class Command(BaseCommand):
    help = 'Add 1000 random users to the database'
    print("adding 1000 users")

    def handle(self, *args, **kwargs):
        users = []
        for i in range(10):
            print("adding user", i)
            username = uuid.uuid4().hex
            email = uuid.uuid4().hex
            first_name = fake.first_name()
            last_name = fake.last_name()
            password = fake.password()
            phone=fake.phone_number()
            address=fake.address()
            inn=uuid.uuid4().hex
            date_joined = fake.date()

            user = User(
                username=username,
                email=email,
                first_name=first_name,
                last_name=last_name,
                password=password,
                phone=phone,
                address=address,
                inn=inn,
                is_active=True,
                is_staff=False,
                is_superuser=False,
                date_joined=date_joined,
                last_login=date_joined,
            )
            user.set_password(password)
            users.append(user)


        User.objects.bulk_create(users)
        self.stdout.write(self.style.SUCCESS('Successfully added 1000 random users!'))

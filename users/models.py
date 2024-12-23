from django.contrib.auth.models import AbstractUser
from django.db import models

class User(AbstractUser):
    id = models.IntegerField(primary_key=True, auto_created=True)
    first_name = models.CharField(max_length=30, blank=True, null=True)
    last_name = models.CharField(max_length=30, blank=True, null=True)
    email = models.EmailField(unique=True)
    username = models.CharField(max_length=30, unique=True)
    password = models.CharField(max_length=128)
    phone = models.CharField(max_length=20, blank=True, null=True)
    address = models.TextField(blank=True, null=True)
    inn = models.CharField(max_length=20, blank=True, null=True)

    def __str__(self):
        return self.username
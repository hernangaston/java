
import uuid
from django.db import models

# Create your models here.
class Director(models.Model):
    id = models.UUIDField(primary_key = True, default = uuid.uuid4,editable = False)
    name = models.CharField(max_length=120)

    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return self.name



class Pelicula(models.Model):
    id = models.UUIDField(primary_key = True, default = uuid.uuid4,editable = False)
    name = models.CharField(max_length=120)
    description = models.TextField()
    director = models.ForeignKey(Director, on_delete=models.SET_NULL, null=True)
    premiere =  models.DateField()

    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return self.name

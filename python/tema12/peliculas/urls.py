
from django.contrib import admin
from django.urls import path

from .views import index, pelicula

urlpatterns = [
    path('', index, name='index'),
    path("['(?P<id>[0-9]+)/detail_pelicula/\\Z']", pelicula, name='pelicula'),
]

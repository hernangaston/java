from django.contrib import admin

from .models import *

# Register your models here.
@admin.register(Director)
class DirectorAdmin(admin.ModelAdmin):
    list_filter = ('name',)
    search_fields = ('name',)
    ordering = ('name',)


@admin.register(Pelicula)
class PeliculaAdmin(admin.ModelAdmin):
    list_filter = ('name', 'director', 'premiere')
    search_fields = ('name', 'director')
    ordering = ('premiere',)
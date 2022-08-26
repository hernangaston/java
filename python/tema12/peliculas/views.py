from django.shortcuts import render

from django.http import request

from .models import Director, Pelicula

# Create your views here.
def index(request):
    directores = Director.objects.all().order_by('name')
    peliculas = Pelicula.objects.all()
    
    d = dict(
        title='Peliculas y directores',
        directores=directores,
        peliculas=peliculas,
        )
    return render(request, 'index.html', context= d)

def pelicula(request, id):
    
    pelicula_obj = Pelicula.objects.get(id=id)
    d = dict(
        title='Detalle pelicula',
        pelicula=pelicula_obj
    )

    return render(request, 'pelicula.html', context= d)
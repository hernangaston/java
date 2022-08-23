'''
En este segundo ejercicio, tenéis que crear una aplicación que obtendrá los elementos impares de una lista pasada por parámetro con filter
y realizará una suma de todos estos elementos obtenidos mediante reduce.
'''

from functools import reduce

lista = [1,3,2,4,8,9,17,22,25,26,27,41,40,27]

def app(lista):
    suma_total = reduce(lambda a,b: a+b,list(filter(lambda x: x%2!=0, lista)))
    return suma_total



if __name__ == '__main__':
    total_suma_impares = app(lista)
    print(total_suma_impares)
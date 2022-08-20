'''
Escribe una función que calcule el área de un triángulo, recibiendo la altura y 
la base como parámetros y otra función que calcule el área de un círculo recibiendo el radio del mismo.
'''

def calcula_area_triangulo(b,h):
    return (b*h)/2

def calcula_area_circulo(r):
    #suponiendo que pi es 3.14
    return 3.14*(r**2)

if __name__ == '__main__':
    area_triangulo = calcula_area_triangulo(5,10)
    area_circulo = calcula_area_circulo(3)
    print(f'el área del triángulo es: {area_triangulo}')
    print(f'el área del círculo es: {area_circulo}')
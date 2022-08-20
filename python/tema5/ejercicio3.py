
'''
Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.
Año es bisiesto si «es múltiplo de 4 y además no es múltiplo de 100 o lo es de 400
Podemos decir que un año es bisiesto si se cumple que A y (no B o C). 
'''

def calcula_bisiesto():
    anio = int(input('Ingrese el año a comprobar: '))
    if anio % 4 == 0 and (anio % 100 != 0 or anio % 400 == 0):
        print("Es bisiesto")
    else:
        print("No es bisiesto")

if __name__ == '__main__':
    calcula_bisiesto()
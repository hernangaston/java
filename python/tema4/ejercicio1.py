'''
Escribe un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.

'''

if __name__ == '__main__':
    edad = int(input('Ingrese su edad: '))
    if edad > 18:
        print('Es mayor de edad')
    else:
        print('No es mayor de edad')

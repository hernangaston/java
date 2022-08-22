'''
En este ejercicio tendréis que crear un módulo que contenga las operaciones básicas de una calculadora: sumar, restar, multiplicar y dividir.

Este módulo lo importaréis a un archivo python y llamaréis a las funciones creadas. Los resultados tenéis que mostrarlos por consola.


'''
import calculadora as c
if __name__ == '__main__':
    print(c.sumar(5,8))
    print(c.restar(5,8))
    print(c.multiplicar(5,8))
    print(c.dividir(5,8))

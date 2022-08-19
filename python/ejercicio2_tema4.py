''' 
    Escribe un programa capaz de mostrar todos los números impares desde un número de inicio y otro final.

    Por ejemplo: teniendo numero_inicial = 2 y numero_final = 8, el programa debe imprimir por consola: [3, 5, 7]
'''

if __name__ == '__main__':
   inicial=1
   final=25
   resultado=[]
   for i in range(inicial, final+1):
    if i % 2 != 0:
        resultado.append(i)
   print(resultado)

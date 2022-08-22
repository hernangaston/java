'''
En este ejercicio, tendréis que crear un archivo py donde creéis un archivo txt, lo abráis y escribáis dentro del archivo.
Para ello, tendréis que acceder dos veces al archivo creado.
'''

def crear_archivo():
    '''
    CREA EL ARCHIVO CON DATOS    
    '''
    f = open('mi_archivo.txt', 'w')
    lst = ['linea 1\n', 'linea 2\n', 'linea 3\n', 'linea 4\n', 'linea 5\n', 'linea 6\n']
    f.writelines(lst)
    f.close()

def leer_datos():
    '''
    MUESTRA LOS DATOS DEL ARCHIVO CREADO ANTERIORMENTE
    '''
    f = open('mi_archivo.txt', 'r')
    d = f.readlines()
    f.close()
    print(d)


if __name__ == '__main__':
    crear_archivo()
    leer_datos()
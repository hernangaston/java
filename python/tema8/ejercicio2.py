'''
En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis una clase Vehículo,
haréis un objeto de ella, lo guardaréis en un archivo y luego lo cargamos.
'''

import pickle

class Vehiculo:
        def __init__(self, color, ruedas):
            self.color = color
            self.ruedas = ruedas

        def __str__(self):
            return f'mi clase vehiculo con color {self.color} y tiene {self.ruedas} ruedas.'


def crear_archivo():
    v1 = Vehiculo('Azul', 3)
    f = open('datos.bin', 'wb')
    pickle.dump(v1, f)
    f.close()

def obtener_datos_desde_archivo():
    f = open('datos.bin', 'rb')
    vehiculo = pickle.load(f)
    f.close()
    print(vehiculo)


if __name__ == '__main__':
    crear_archivo()
    obtener_datos_desde_archivo()
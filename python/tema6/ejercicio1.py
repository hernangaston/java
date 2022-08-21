'''
En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

Color

Ruedas

Puertas

Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

Velocidad

Cilindrada

Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.


'''

class Vehiculo:
    color = 'verde'
    ruedas = 4
    puertas = 3

class Coche(Vehiculo):
    velocidad = 150
    cilindrada = 4

new_coche = Coche()

if __name__ == '__main__':
    print(f'Color: {new_coche.color}\nRuedas: {new_coche.ruedas}\nPuertas: {new_coche.puertas}\nVelocidad: {new_coche.velocidad}\nCilindrada: {new_coche.cilindrada}')
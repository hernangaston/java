'''
En este segundo ejercicio, tendréis que crear un programa que tenga una clase llamada Alumno
que tenga como atributos su nombre y su nota. Deberéis de definir los métodos para inicializar sus atributos,
imprimirlos y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.
'''

class Alumno:
    def __init__(self):
        self.nombre = 'Hernan, Hernan'
        self.nota = 2
        self.resultado_nota()

    def resultado_nota(self):
        if self.nota>=4:
            print(f'Su nota es: {self.nota} APROBADO')
        else:
            print(f'Su nota es: {self.nota} NO APROBADO')

if __name__ == '__main__':
    new_alumno = Alumno()
'''Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.'''


class Persona:
    '''
        #TRATO DE EMULAR COMO SE HARIA CON OTROS LENGUAJES EJ. JAVA
    '''
    edad = 0
    nombre = ""
    telefono = ""

    def set_edad(self, edad):
        self.edad = edad

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_telefono(self, telefono):
        self.telefono = telefono


    def get_edad(self):
        return self.edad
    def get_nombre(self):
        return self.nombre
    def get_telefono(self):
        return self.telefono

if __name__ == "__main__":
    new_person = Persona()
    new_person.set_edad(10)
    new_person.set_nombre("Jose")
    new_person.set_telefono("3463-958432")
    print(f'Nombre: {new_person.get_nombre()}, Edad: {new_person.get_edad()}, Teléfono: {new_person.get_telefono()}')
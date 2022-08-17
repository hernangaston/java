'''
Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
'''

class Persona:
    edad=0
    nombre=""
    telefono=""

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

class Cliente(Persona):
    credito=True
    def set_credito(self, credito):
        self.credito = credito
    def get_credito(self):
        return self.credito

class Trabajador(Persona):
    salario=25000.00
    def set_salario(self, salario):
        self.salario = salario
    def get_salario(self):
        return self.salario

if __name__ == "__main__":
    new_cliente = Cliente()
    new_cliente.set_edad(40)
    new_cliente.set_nombre("Juan")
    new_cliente.set_telefono("+54 11-3658-9875")
    new_cliente.set_credito(False)

    print(f'Nombre: {new_cliente.get_nombre()}, Edad: {new_cliente.get_edad()}, Teléfono: {new_cliente.get_telefono()}, Credito: {new_cliente.get_credito()}')

    new_trabajador = Trabajador()
    new_trabajador.set_edad(35)
    new_trabajador.set_nombre("Hernan")
    new_trabajador.set_telefono("+54 341-451-587")
    new_trabajador.set_salario(150317.45)
    print(f'Nombre: {new_trabajador.get_nombre()}, Edad: {new_trabajador.get_edad()}, Teléfono: {new_trabajador.get_telefono()}, Salario: {new_trabajador.get_salario()}')

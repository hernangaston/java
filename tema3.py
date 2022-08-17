#parte 1

def mifuncion(a,b,c):
    return print(a+b+c)

#parte 2
class Coche():
    def __init__(self):
        self.n_puertas = 0

    def incremetar_puertas(self):
        self.n_puertas += 1

mi_coche = Coche()
mi_coche.incremetar_puertas()



if __name__ == "__main__":
    print("="*30+"PARTE UNO")
    mifuncion(5,6,7)
    print("="*30+"PARTE DOS")
    print(f'Numero de puertas del coche: {mi_coche.n_puertas}')

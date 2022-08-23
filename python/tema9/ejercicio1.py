'''
Crea un script que le pida al usuario una lista de países (separados por comas). Éstos se deben almacenar en una lista. No debería haber países repetidos (haz uso de set).
Finalmente, muestra por consola la lista de países ordenados alfabéticamente y separados por comas.
'''


def crear_lista():
    lista_paises = []
    while len(lista_paises)<5:
        pais = input('Ingrese un país a la lista: ')
        lista_paises.append(pais)
        continue
    lista_unicos = sorted(list(set(lista_paises)))

    return lista_unicos

if __name__ == '__main__':
    u = crear_lista()
    print(u)


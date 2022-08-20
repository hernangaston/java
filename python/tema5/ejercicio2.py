'''
Escribe una función que pueda decirte si un número (número entero) es primo o no.
'''


def es_numero_primo(numero):
    for i in range(2, numero):
        if numero%i == 0:
            return 'no es primo'
    return 'es primo'

if __name__ == '__main__':
    rta = es_numero_primo(22)
    print(rta)
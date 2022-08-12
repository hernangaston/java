'''Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
 se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
También habrá que poner un default para cuando el valor de la variable no sea una estación.'''
print("="*50+"IF")
numeroIf = -3

if numeroIf < 0:
    print(f'La el valor de la variable numeroIf es NEGATIVO')
elif numeroIf > 0:
    print(f'La el valor de la variable numeroIf es POSITIVO')
else:
    print(f'La el valor de la variable numeroIf es CERO')
print("="*50+"WHILE")

numeroWhile = 0

while numeroWhile < 3:
    numeroWhile+=1
    print(numeroWhile)
print("="*50+"DO WHILE does not exists in python we emulate the behavior with WHILE TRUE")
numeroWhile2 = 0
while True:
    numeroWhile2+=1
    print(numeroWhile2)
    if numeroWhile2>=1:
        break
print("="*50+"FOR")
numeroFor = 0

for n in range(0,3):
    numeroFor+=1
    print(numeroFor)
print("="*50+"SWITCH")
estacion="VERANO"
#ES NUEVO EN PYTHON 3.10 SI LO CORREN EN UNA VERSION INFERIOR NO FUNCIONA
match estacion:
    case estacion if estacion == "VERANO":
        print(f'Usted esta en {estacion}')
    case estacion if estacion == "INVIERNO":
        print(f'Usted esta en {estacion}')
    case estacion if estacion == "OTOÑO":
        print(f'Usted esta en {estacion}')
    case estacion if estacion == "PRIMAVERA":
        print(f'Usted esta en {estacion}')
    case _:
        print(f'El valor {estacion} no es una estacion')
'''
En este segundo ejercicios tendréis que crear un script que nos diga si es la hora de ir a casa.
Tendréis que hacer uso del modulo time. Necesitaréis la fecha del sistema y poder comprobar la hora.
En el caso de que sean más de las 7, se mostrará un mensaje y en caso contrario, haréis una operación para calcular el tiempo que queda de trabajo.
'''

import time
import datetime


def time_to_go_home():
    '''
    Calcula las horas que se necesitan para terminar la jornada.
    '''
    #timepo local
    t = time.localtime()
    #tiempo local formateado
    hora_actual = time.strftime("%H:%M:%S", t)
    #generacion de horario de salida a partir de un entero
    hora_salida_time = time.strptime("".join('7:00:00'), "%H:%M:%S")
    hora_salida = time.strftime("%H:%M:%S", hora_salida_time)
    #formateando horarios a datetime
    hora_actual_d = datetime.datetime.strptime(hora_actual,"%H:%M:%S")
    hora_salida_d = datetime.datetime.strptime(hora_salida,"%H:%M:%S")

    if hora_actual_d>hora_salida_d:
        print('Hora de ir a casa')
    else:
        print(f'Faltan {hora_salida_d-hora_actual_d} horas para terminar la joranada.')

if __name__ == '__main__':
    time_to_go_home()

    
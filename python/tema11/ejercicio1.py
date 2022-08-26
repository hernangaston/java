'''
En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres columnas:
la columna id de tipo entero, la columna nombre que será de tipo texto y la columna apellido que también será de tipo texto.

Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 alumnos a la tabla.

Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos por consola.
'''
import sqlite3

def main():
    alumnos = [('jose', 'ajose'), ('pedro', 'apedro'), ('roberto', 'aroberto'), ('daniel', 'adaniel'), \
        ('helena', 'ahelena'), ('catalina', 'acatalina'), ('laura', 'alaura'), ('micaela', 'amicaela'), ('juan', 'ajuan')]

    conn = sqlite3.connect('ejercicio1.db')
    cursor = conn.cursor()
    
    insertar_alumnos(cursor, alumnos)
    conn.commit()
    
    d = buscar_alumno(cursor, 'micaela')

    cursor.close()
    conn.close()

    print(d)

def insertar_alumnos(cursor, alumnos):
    for i in range(len(alumnos)):
        try:
            cursor.execute(f'INSERT INTO alumnos(id, nombre, apellido) VALUES({i},"{alumnos[i][0]}", "{alumnos[i][1]}")')
        except:
            pass


def buscar_alumno(cursor, nombre):
    query = f'SELECT nombre FROM alumnos WHERE nombre="{nombre}"'
    rows = cursor.execute(query)    
    data = rows.fetchone()
    return data



if __name__ == '__main__':
    main()
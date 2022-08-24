'''
En este segundo ejercicio, tendréis que crear una interfaz sencilla la cual debe de contener
una lista de elementos seleccionables, también debe de tener un label con el texto que queráis.
'''

import tkinter as tk
from tkinter import ttk

app = tk.Tk()
app.geometry('200x100')
labelTop = tk.Label(app,text="Lista de tareas")
labelTop.grid(column=0, row=0)

def callbackFunc(event):
     print(f'Elegiste la tarea {comboExample.get()}')

comboExample = ttk.Combobox(app, values=["Tarea 1","Tarea 2","Tarea 3","Tarea 4"])

comboExample.grid(column=0, row=1)

comboExample.bind("<<ComboboxSelected>>", callbackFunc)


app.mainloop()
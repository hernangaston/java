'''
En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción que se ha seleccionado
y que contenga un botón de reinicio para que deje todo como al principio.

Al principio no tiene que haber una opción seleccionada.
'''

import tkinter as tk

app = tk.Tk()

radioValue = tk.StringVar() 

 
boton1 = tk.Radiobutton(app, text='Boton 1', variable=radioValue, value='boton 1') 
boton2 = tk.Radiobutton(app, text='Boton 2', variable=radioValue, value='boton 2') 
boton3 = tk.Radiobutton(app, text='Boton 3', variable=radioValue, value='boton 3')


boton1.grid(column=0, row=0, sticky="W")
boton2.grid(column=0, row=1, sticky="W")
boton3.grid(column=0, row=2, sticky="W")

label = tk.Label(app, text='Elegiste')
label.grid(column=2, row=0, sticky="E", padx=40)

def limpiar_valor():
    radioValue.set(value='')

boton_limpiar = tk.Button(app, text="Limpiar", command=limpiar_valor)

boton_limpiar.grid(column=2, row=3, sticky="S")


labelValue = tk.Label(app, textvariable=radioValue)
labelValue.grid(column=2, row=1, sticky="E", padx=40)


app.mainloop()
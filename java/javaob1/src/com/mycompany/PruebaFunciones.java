package com.mycompany;


public class PruebaFunciones {
    public static void main(String[] args) {
        //Se puede invocar cuando es public
        Funciones.holaHernan();
        Funciones.holaHernan("Hernan");
        Funciones.holaHernan("Hernan", "Gaston");
        //Protected invocada desde la clase funciones
        Funciones.otracosa("Hernan");
    }
}

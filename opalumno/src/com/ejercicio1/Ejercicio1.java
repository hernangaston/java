package com.ejercicio1;

/**
 * CLASE PARA EJERCICIO 1 TIPOS DE DATOS Y COMENTARIOS
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 *
 * Crea un proyecto de Java desde 0
 *
 * Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 *
 * Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 *
 * Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        /*TIPOS DE DATOS
        1.Numericos
         */
        //1.1 enteros
        byte datoByte = 5;
        int datoInt = 5;
        short datoShort = 5;
        long datoLong = 5;

        //1.2 decimales
        float datoFloat = 5.5f;
        double datoDouble = 5.5d;

        //2. boleanos
        boolean datoBoleano = false; // or true
        //3. caracteres
        char datoChar = 'a';
        String datoString = "Lorem ipsum ...";
        System.out.println("Los tipos de datos son: ");
        System.out.println("Type byte: "+datoByte);
        System.out.println("Type int: "+datoInt);
        System.out.println("Type short: "+datoShort);
        System.out.println("Type long: "+datoLong);
        System.out.println("Type float: "+datoFloat);
        System.out.println("Type double: "+datoDouble);
        System.out.println("Type boolean: "+datoBoleano);
        System.out.println("Type char: "+datoChar);
        String nombreClaseString = datoString.getClass().getName();
        System.out.println("Type "+nombreClaseString+": "+datoString);

    }
}

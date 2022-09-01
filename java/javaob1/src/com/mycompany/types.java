package com.mycompany;

public class types {
    public static void main(String[] args){
        // variables
        // tipo nombre = valor;
        // ej.: int mivariable = 0;
        // la otra opcion es primero declararla ej:
        // int mivariable;
        // y despues darle valor ej: int mivariable;

        //TIPOS DE DATOS PRIMITIVOS "NO PUEDEN SER NULOS POR ESO SE GENERAN LOS TIPOS DE DATOS ENVOLTORIO"
        //numericos
        byte numerobyte = 2; //1byte
        short numeroshort = 2; //2 bytes
        int numeroint = 2; // 4 bytes
        long numerolong = 2; // 8 bytes
        //flotantes
        float mifloat = 1.2f;
        double midouble = 2.88;

        //char
        char micaracter = 'a'; //un solo caracter

        //boleanos
        boolean mmitrue = true;
        boolean mmifalse = false;

        //cadena de texto son clases
        String micadena = "Hernan";

        //TIPOS DE DATOS WRAPPER O ENVOLTORIO PERMITEN NULL
        Integer minumero = null;



        System.out.println(micadena);
    }

}

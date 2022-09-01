package com.mystring;

public class MainMyString {
    public static void main(String[] args) {
        /*
        METODOS DE LA CLASE STRING
        length()
        startsWith("")
        endsWith("")
        indexOf("")
        substring(1,5)
        trim()
        equals()
        compareTo
         */

        String micadena = "Mi cadena de ejemplo  ";
        String micadena2 = micadena.toUpperCase();
        System.out.println(micadena.toUpperCase());
        System.out.println(micadena.trim());
        System.out.println("longitud: "+micadena.length());
        System.out.println("Comienza con: "+micadena.startsWith("Mi"));
        System.out.println(micadena.endsWith(" "));
        System.out.println(micadena.substring(8,15));

        if(micadena.equalsIgnoreCase(micadena2)){
            System.out.println("Son iguales!!");
        }


    }
}

package com.mycompany;

public class MiArray {
    public static void main(String[] args) {
        String nombre1 = "PAPA";
        String nombre2 = "HELENA";
        String nombre3 = "CATALINA";

        String[] nombres = new String[3];//nuevo array de 3 strings
        int[] numeros = new int[5];//nuevo array de 5 integer
        Casa[] casas = new Casa[8];//nuevo array de 8 objetos de la clase casa

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        //otra forma de declarar los arrays es la sig.:
        String[] nombres2 = new String[]{nombre1, nombre2, nombre3};

        for(int i = 0; i<nombres2.length; i++) {
            System.out.println("Array 2: "+nombres2[i]);
        }

    }
}

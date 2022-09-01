package com.mycompany;

import java.util.Scanner;

public class ScaninMain {
    public static void main(String[] args) {
        Scanner miscaner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String name = miscaner.nextLine();
        System.out.println("Ingrese un numero de año: ");
        int anio = miscaner.nextInt();
        System.out.println("El nombre ingresado es: "+name);
        System.out.println("El anio ingresado es: "+anio);
        System.out.println("EOF");
    }
}

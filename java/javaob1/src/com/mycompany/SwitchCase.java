package com.mycompany;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "pepe";

        switch (weather){
            case "sunny":
                System.out.println("Caso 1: El clima esta "+weather);
                break;
            case "cloudy":
                System.out.println("Caso 2: El clima esta "+weather);
                break;
            case "cold":
                System.out.println("Caso 3: El clima esta "+weather);
                break;
            default:
                System.out.println("No hay clima identificado.");
                //no lleva break
        }

        System.out.println("End weather");

    }
}

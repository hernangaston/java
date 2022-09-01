package com.mycompany;

public class Funciones {
    // la palabra void significa que no devuelve nada
    public static void main(String[] args){
        
        holaHernan("Hernan");
        holaHernan("Papá");
        holaHernan("Helena");
        holaHernan("Catalina");
        String saludoMundo = devolverHM();
        System.out.println(saludoMundo);
    }

    public static void holaHernan() {
        System.out.println("Hola Hernan funcion sin parametros");
    }
    // la funcion holaHernan SOBRECARGADA
    //es la misma funcion que la anterior pero con parametros
    //si no tuviera parametros daria error
    public static void holaHernan(String name) {
        System.out.println("Hola " + name);
    }
    // la funcion holaHernan SOBRECARGADA
    //es la misma funcion que la anterior pero con mas parametros
    public static void holaHernan(String name, String surname) {
        System.out.println("Hola " + name +" " + surname);
    }
    //funcion protected solo se puede acceder desde funcion hij o dentro del mismo paquete
    protected static void otracosa(String name) {
        System.out.println("Hola mundo protected para: " + name);
    }
    //la palabra String significa de "debe" reuturn a Strinng
    //if the word is int mustreturn an Integer and so on
    private static String devolverHM(){
        return "Hola Mundo!!!";
    }
}

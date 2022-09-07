package Ejercicios789;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedList {
    public static void mostrarArrays(){
        /*Crea un ArrayList de tipo String, con 4 elementos.
        Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
         */

        ArrayList<String> lista = new ArrayList<>();
        lista.add("elemento 1");
        lista.add("elemento 2");
        lista.add("elemento 3");
        lista.add("elemento 4");

        LinkedList<String> miLinkedList = new LinkedList<>(lista);

        for(String e: lista){
            System.out.println("Elemento de array list: "+ e);
        }

        for(String e: miLinkedList){
            System.out.println("Elemento de linked list: "+ e);
        }
    }

}

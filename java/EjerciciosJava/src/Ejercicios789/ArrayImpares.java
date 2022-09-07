package Ejercicios789;

import java.util.ArrayList;

public class ArrayImpares {
    /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        Por último, vuelve a recorrerlo y muestra el ArrayList final.
        Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
     */
    public static void impares(){
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for(int i = 1; i <=10; i++){
            if(i%2!=0) {
                listaEnteros.add(i);
            }
        }
        for(int e: listaEnteros){
            System.out.println(e);
        }
    }
}

package com.mycompany;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        while(count < 10){
            count++;
            if(count%2!=0)
                continue;//continue no ejecuta nada mas y pasa a la sig iteración
                //break rompe el bucle directamente
            System.out.println("Hola while nro.: " +count);
        }
    }
}

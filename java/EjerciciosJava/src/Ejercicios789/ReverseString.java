package Ejercicios789;

public class ReverseString {
    public static void reverse(String texto) {

        String miNuevaCadena = "";

        for(int i = texto.length()-1; i>=0; i--){
            miNuevaCadena+=texto.charAt(i);
        }

        System.out.println(miNuevaCadena);
    }
}

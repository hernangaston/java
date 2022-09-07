package Ejercicios789;
/*
Sorpréndenos creando un programa de tu elección que utilice
InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */

import java.io.*;
import java.util.*;

public class MyProgram {

    public static void main() {
        /*PROGRAMA QUE GENERA UN ARCHIVO DE INFORME A PARTIR DE UN ARCHIVO DE TEXTO*/

        String nombreArchi = "src/Ejercicios789/text.txt";
        testFunction(nombreArchi);
    }

    private static void testFunction(String nombreArchi) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        ArrayList<Character> arrayList = new ArrayList<Character>();

        try {
            InputStream fichero = new FileInputStream(nombreArchi);
            PrintStream informeSalida = new PrintStream("src/Ejercicios789/informe.txt");
            int cantidad=0;
            try {
                byte []datos = new byte[0];
                int data = fichero.read(datos);

                while (data != -1) {

                    if(!arrayList.contains((char)data)) {
                        arrayList.add((char)data);
                    }

                    if(hashMap.containsKey((char)data)){
                        hashMap.put((char)data, hashMap.get((char)data) + 1);
                    }else{
                        hashMap.put((char)data, 1);
                    }
                    cantidad++;
                    data = fichero.read();
                }

                informeSalida.println("-------------ANALIZADOR DE ARCHIVOS DE TEXTO-------------");
                Character key = Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
                Character minuskey = Collections.min(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
                informeSalida.append("\nCaracter con MAS apariciones '").append(key).append("': ").append(String.valueOf(hashMap.get(key))).append("\n");
                informeSalida.append("\nCaracter con MENOS apariciones '").append(minuskey).append("': ").append(String.valueOf(hashMap.get(minuskey))).append("\n");
                informeSalida.append("\nLista de caracteres utilizados: \n");
                for(Character e:arrayList){
                    if(e!=null) {
                        informeSalida.append(e);
                        informeSalida.append("-");
                    }
                }
                informeSalida.append("\n\nTotal de caracteres en el archivo: ");
                informeSalida.append(String.valueOf(cantidad));

            } catch (IOException e) {
                System.out.println("Error al leer: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir archivo: " + e.getMessage());
        }
    }

}

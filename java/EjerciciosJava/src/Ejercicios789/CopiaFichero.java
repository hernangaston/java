package Ejercicios789;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaFichero {
    public static void main() {
        /*Utilizando InputStream y PrintStream,
         crea una función que reciba dos parámetros: "fileIn" y "fileOut".
          La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn"
          al fichero dado en "fileOut".
         */

        try {
            copiarFicheros("src/Ejercicios789/text.txt", "src/Ejercicios789/text2.txt");
        }catch (Exception e) {
            System.out.println("No se puede copiar el fichero");
        }
    }

    private static void copiarFicheros(String fileIn, String fileOut) {
        try{
            File origen = new File(fileIn);
            File destino = new File(fileOut);

            FileInputStream in = new FileInputStream(origen);
            FileOutputStream out = new FileOutputStream(destino);
            //SI C == -1 SIGNIFICA EOF.
            int c;
            while( (c = in.read() ) != -1) {
                out.write(c);
            }

            in.close();
            out.close();

        }catch(IOException e){
            System.out.println("No se pudo acceder al fileIn/fileOut!!");
        }
    }

}

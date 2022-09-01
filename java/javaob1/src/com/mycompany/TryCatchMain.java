package com.mycompany;

public class TryCatchMain {
    public static void main(String[] args) {
        try {
            int n = 5/0;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            //cerrar recursos significa por ejemplo cerrar coneccion a bbdd
            //cerrar archivos o borrar algun archivo temporal etc.
            System.out.println("Cierre de recursos");
        }

        System.out.println("End of file");
    }
}

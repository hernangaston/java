package com.mycompany;

public class PolimorfClase {
    public static void main(String[] args) {
        Coche micoche1 = new Coche();
        CocheElectrico micoche2 = new CocheElectrico();
        System.out.println(micoche1);
        System.out.println(micoche2);

        //POLIMORFISMO
        Coche micoche3 = new Coche();
        Coche micoche4 = new CocheElectrico(); //-> aca esta la diferencia, puedo crear un objeto a partir de la clase padre

        //PARA COMPLETAR EL TEMA CLASES CON LA PALABRA RESERVADA abstract (ANTES DE CLASS) SE CREA UNA CLASE ABSTRACTA
        //ESTE CLASE ES IGUAL A CUALQUIER CLASE SOLO QUE "NO" SE PUEDE INSTANCIAR
        //ES DECIR EXISTE SOLO A TRAVES DE CLASES HIJAS, NO SE PUEDEN CREAR OBJETOS

        System.out.println(micoche3);
        System.out.println(micoche4);
    }
}

package com.mycompany;

public class CocheMain {

    public static void main(String[] args) {
        Coche micoche = new Coche();
        Coche micoche2 = new Coche(4, "rojo", "FORD","Ecosport",5,1600.00);
        System.out.println(micoche);
        System.out.println(micoche2);
        micoche.acelerar(20);
        micoche2.acelerar(30);
        System.out.println(micoche);
        System.out.println(micoche2);

        CocheElectrico miCochee = new CocheElectrico("mi motor");
        miCochee.color="azul";
        miCochee.ruedas=4;
        miCochee.acelerar(45);
        System.out.println(miCochee);

        CocheElectrico miCochee2 = new CocheElectrico(4,"negro","ffadsa","fsdfs",3,950.25,"e-motor");
        miCochee2.acelerar(250);
        System.out.println(miCochee2);
    }
}

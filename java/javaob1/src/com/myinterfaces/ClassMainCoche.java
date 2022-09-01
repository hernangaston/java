package com.myinterfaces;

import com.mycompany.Coche;

public class ClassMainCoche {
    public static void main(String[] args) {
        InterfaceCoche interfaceCoche = new CocheClassiscImpl();
        InterfaceCoche interfaceCoche1 = new CocheSportImpl();

        Coche micoche = interfaceCoche.crearCocheDemo();

    }
}

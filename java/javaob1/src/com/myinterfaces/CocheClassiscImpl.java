package com.myinterfaces;

import com.mycompany.Coche;
import com.mycompany.CocheElectrico;

public class CocheClassiscImpl implements InterfaceCoche{

    @Override
    public Coche crearCocheDemo(){
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }
}

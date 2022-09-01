package com.myinterfaces;

import com.mycompany.Coche;
import com.mycompany.CocheElectrico;

public class CocheSportImpl implements InterfaceCoche{
    @Override
    public Coche crearCocheDemo(){
        System.out.println("Creando coche deportivo");
        return new CocheElectrico();
    }
}

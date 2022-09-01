package com.mycompany;

import java.util.ArrayList;
import java.util.List;

public class MiArrayList {
    public static void main(String[] args) {
        List<String> listNombres = new ArrayList<>();
        listNombres.add("Nombre1");
        listNombres.add("Nombre2");
        listNombres.add("Nombre3");
        listNombres.add("Nombre4");
        listNombres.add("Nombre5");
        System.out.println(listNombres);
        for(String n : listNombres){
            System.out.println(n);
        }

        List<Casa> casas = new ArrayList<>();
        casas.add(new Casa("Colonial"));
        casas.add(new Casa("Chalet"));
        casas.add(new Casa("Cuadrada"));

        System.out.println(casas);

        for(Casa casa : casas){
            System.out.println(casa);
        }

    }
}

package com.mycompany;

import java.util.HashMap;
import java.util.Map;

public class MapasMain {
    public static void main(String[] args) {
        //LOS MAPAS SON TIPO DICCIONARIOS EN PYTHON
        //PARES DE DATOS TIPO KEY, VALUE
        //SE CREAN CON LA INTERFAZ MAP Y SE DECLARAN LOS TIPOS DE LOS PARES DE DATOS
        Map<String, String> miMap = new HashMap<>();
        miMap.put("dni1", "Hernan Gaston");
        miMap.put("dni2", "Helena Gaston");
        miMap.put("dni3", "Catalina Gaston");
        miMap.put("dni4", "Evelina Gaston");

        System.out.println(miMap);
        System.out.println("Las claves son:");
        for(String key: miMap.keySet()){

            System.out.println(key);
        }
        System.out.println("Los valores son: ");
        for(String value: miMap.values()){
            System.out.println(value);
        }
        System.out.println("Imprimimos los pares k,v: ");
        for(Map.Entry<String, String> pair: miMap.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }


    }
}

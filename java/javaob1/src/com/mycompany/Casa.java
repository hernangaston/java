package com.mycompany;

public class Casa {
    String modelo = "";

    public Casa(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo;
    }
}

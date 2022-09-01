package com.mycompany;

public class Coche {
    //atributos
    Integer ruedas;
    String color;
    String fabricante;
    String modelo;
    Integer puertas;
    Double peso;
    Integer velocidad=0;
    //clase constructor
    public Coche(){

    }
    public Coche(Integer ruedas, String color, String fabricante, String modelo, Integer puertas, Double peso){
        this.ruedas = ruedas;
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.puertas = puertas;
        this.peso = peso;
    }

    //metodo
    public void acelerar(Integer cantidad){
        if(cantidad>60 && cantidad<120) {
            this.velocidad+=cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "ruedas=" + ruedas +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}

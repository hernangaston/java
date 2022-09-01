package com.mycompany;

public class CocheElectrico extends Coche{
    String motorElectrico;
    public CocheElectrico(){}
    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    //podemos usar el constructor sobrecargado con el metodo super
    //para que invoque el constructor de la clase padre
    public CocheElectrico(Integer ruedas, String color, String fabricante, String modelo, Integer puertas, Double peso, String motorElectrico){
        super(ruedas, color,fabricante,modelo,puertas,peso);
        this.motorElectrico = motorElectrico;
    }
    //sobreescritura de metodos


    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadajustada = cantidad - 150;
        super.acelerar(cantidadajustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", ruedas=" + ruedas +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}

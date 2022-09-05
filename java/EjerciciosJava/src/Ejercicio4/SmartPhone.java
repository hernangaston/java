package Ejercicio4;

public class SmartPhone extends SmartDevice{
    boolean camara_frontal;
    int almacenamiento;

    public SmartPhone(){}

    public SmartPhone(boolean camara_frontal, int almacenamiento) {
        this.camara_frontal = camara_frontal;
        this.almacenamiento = almacenamiento;
    }

    public SmartPhone(double with, double height, boolean camara, String procesador, boolean camara_frontal, int almacenamiento) {
        super(with, height, camara, procesador);
        this.camara_frontal = camara_frontal;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara_frontal=" + camara_frontal +
                ", almacenamiento=" + almacenamiento +
                ", with=" + with +
                ", height=" + height +
                ", camara=" + camara +
                ", procesador='" + procesador + '\'' +
                '}';
    }
}

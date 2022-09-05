package Ejercicio4;

public class SmartWatch extends SmartDevice{
    boolean gps;

    public SmartWatch() {}

    public SmartWatch(boolean gps) {
        this.gps = gps;
    }

    public SmartWatch(double with, double height, boolean camara, String procesador, boolean gps) {
        super(with, height, camara, procesador);
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "gps=" + gps +
                ", with=" + with +
                ", height=" + height +
                ", camara=" + camara +
                ", procesador='" + procesador + '\'' +
                '}';
    }
}

package Ejercicio5;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheCrud micoche = new CocheCrudImpl();

        micoche.save();
        micoche.findAll();
        micoche.delete();

    }
}

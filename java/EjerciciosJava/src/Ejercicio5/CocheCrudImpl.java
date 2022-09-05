package Ejercicio5;

public class CocheCrudImpl implements CocheCrud{

    @Override
    public void save() {
        System.out.println("SAVE");
    }

    @Override
    public void findAll() {
        System.out.println("FIND ALL");;
    }

    @Override
    public void delete() {
        System.out.println("DELETE");;
    }
}

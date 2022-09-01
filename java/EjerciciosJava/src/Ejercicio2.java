public class Ejercicio2 {
    /*Para este ejercicio tendréis que crear una función
    que reciba un precio y devuelva el precio con el IVA incluido.
    */
    public static void main(String[] args) {

        double precio = 250.00;
        double precioFinal = getPrecioFinal(precio);
        System.out.println("El precio final es: "+precioFinal);
    }

    static double getPrecioFinal(double precio) {
        //EN ARG EL IVA ES EL 21%
        return precio*1.21;
    }
}

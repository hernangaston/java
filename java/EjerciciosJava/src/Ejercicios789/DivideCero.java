package Ejercicios789;

public class DivideCero {

    public static void main() {
        try {
            double res = dividePorCero();
            System.out.println("El resultado es: "+res);
        } catch (ArithmeticException e) {
            System.out.println("Que no se puede dividir por cero!!");
        }
    }
    public static double dividePorCero() throws ArithmeticException {
        try{
            double resultado = 3 / 0;
            return resultado;
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}

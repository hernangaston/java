/*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

String[] nombres = {"", "", "", ""}
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Helena", "Catalina", "Papá", "Mamá"};
        String concatenados = "";
        for(String nombre : nombres) {
            concatenados += nombre;
        }
        System.out.println(concatenados);
    }
}

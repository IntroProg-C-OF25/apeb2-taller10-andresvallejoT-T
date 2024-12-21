
import java.util.Scanner;

/*Ejercicio 5
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100, se debe aplicar un descuento.
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 * @author Andrés
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        boolean si = true;
        int option;
        while (si) {
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s", "Que desea hacer?", "1. Agregar producto", "2 Actualizar existencia y precio", "3 Buscar producto", "4 Eliminar produto", "5 salir", "Escriba la opcion: ");
            option = tcl.nextInt();
        }
    }
}


import java.util.Scanner;

/*Ejercicio 5
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100, se debe aplicar un descuento.
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 * @author Andrés
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double[][] pre = new double[10000][2];
        String[] name = new String[10000];
        String pro;
        boolean si = true, rt = false;
        double total;
        int var, i = 0, cant;
        while (si) {
            System.out.println("Que desea hacer\n 1. Agregar prducto\n2. Eliminar producto\n3. Comprar Producto\n4. Buscar producto\n5. Actualizar Podructo\n6.salir\nEleguir opcion: ");
            var = tcl.nextInt();
            switch (var) {
                case 1:
                    System.out.print("Ingresar nombre: ");
                    name[i] = tcl.next();
                    System.out.println("Ingresar Precio: ");
                    pre[i][0] = tcl.nextDouble();
                    System.out.println("Ingresar Cantidad: ");
                    pre[i][1] = tcl.nextDouble();
                    i++;
                    break;
                case 2:
                    System.out.print("Que producto desea eliminar: ");
                    pro = tcl.next();
                    for (int j = 0; j < name.length; j++) {
                        if (pro.equals(name[j])) {
                            name[j] = "";
                            pre[j][0] = 0;
                            pre[j][1] = 0;
                            i--;
                        } else {
                            System.out.println("No se encontro el producto");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Que producto desea comprar: ");
                    pro = tcl.next();
                    for (int j = 0; j < name.length; j++) {
                        if (pro.equals(name[j])) {
                            System.out.println("Que cantidad?: ");
                            cant = tcl.nextInt();
                            if (cant > pre[j][1]) {
                                System.out.println("No poseemos esa cantida poseemos " + pre[j][1]);
                            } else {
                                pre[j][1] -= cant;
                                total = pre[j][0] * cant;
                                total = total + total * 0.15;
                                if (total >= 100) {
                                    total = total - total * 0.3;
                                    System.out.println("Su total es " + total + " con un 30% de descuento");
                                } else {
                                    System.out.println("Su total es " + total + " sin descuento");
                                }
                                break;
                            }
                        } else {
                            System.out.println("No se encontro el producto");
                            break;
                                                    }
                    }

                    break;
                case 5:
                    System.out.println("Cual productos desea actualizar");
                    pro = tcl.next();
                    for (int j = 0; j < name.length; j++) {
                        if (pro.equals(name[i])) {
                            System.out.println("Ingresar nuevo precio: ");
                            pre[j][0] = tcl.nextDouble();
                            System.out.println("Ingresar nueva cantidad: ");
                            pre[j][1] = tcl.nextInt();
                            rt = false;
                            break;
                        } else {
                            rt = true;
                        }

                    }
                    if (rt) {
                        System.out.println("no se encontro el producto");
                    }
                    break;
                case 4:
                    System.out.println("Cual productos busca");
                    pro = tcl.next();
                    for (int j = 0; j < name.length; j++) {
                        if (pro.equals(name[j])) {
                            System.out.println("Producto: " + pro);
                            System.out.println("Precio: " + pre[j][0]);
                            System.out.println("Cantidad: " + pre[j][1]);
                            rt = false;
                            break;
                        } else {
                            rt = true;
                        }

                    }
                    if (rt) {
                        System.out.println("no se encontro el producto");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del Sistema....");
                    si=false;

                    break;
                default:
                    System.out.println("Intentelo de nuevo");
            }
        }
        System.out.println("Salida exitosa");
    }
}
/*run:
Que desea hacer
 1. Agregar prducto
2. Eliminar producto
3. Comprar Producto
4. Buscar producto
5. Actualizar Podructo
6.salir
Eleguir opcion: 
1
Ingresar nombre: oreo
Ingresar Precio: 
10
Ingresar Cantidad: 
900
Que desea hacer
 1. Agregar prducto
2. Eliminar producto
3. Comprar Producto
4. Buscar producto
5. Actualizar Podructo
6.salir
Eleguir opcion: 
3
Que producto desea comprar: oreo
Que cantidad?: 
100
Su total es 805.0 con un 30% de descuento
Que desea hacer
 1. Agregar prducto
2. Eliminar producto
3. Comprar Producto
4. Buscar producto
5. Actualizar Podructo
6.salir
Eleguir opcion: 
4
Cual productos busca
oreo
Producto: oreo
Precio: 10.0
Cantidad: 800.0
Que desea hacer
 1. Agregar prducto
2. Eliminar producto
3. Comprar Producto
4. Buscar producto
5. Actualizar Podructo
6.salir
Eleguir opcion: 
5
Cual productos desea actualizar
oreo
no se encontro el producto
Que desea hacer
 1. Agregar prducto
2. Eliminar producto
3. Comprar Producto
4. Buscar producto
5. Actualizar Podructo
6.salir
Eleguir opcion: 
6
Saliendo del Sistema....
Salida exitosa
BUILD SUCCESSFUL (total time: 57 seconds)
*/
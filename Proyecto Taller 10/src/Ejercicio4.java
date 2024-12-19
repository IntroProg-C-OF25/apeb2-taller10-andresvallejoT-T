
import java.util.Scanner;

/*Ejercicio 4
 * Crea un programa que gestione el inventario de una tienda. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en 
 * la tienda, con información como nombre, precio y cantidad. El programa debe permitir 
 * agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 * @author Andrés
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[][] pro = new String[1000][3];
        int c = 0, produc = 0, option = 0;
        String busca, act;
        boolean rt;
        while (c == 0) {
            if (produc <= pro.length) {
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "Que desea hacer?", "1. Agregar producto", "2 Actualizar existencia y precio", "3 Buscar producto", "4 Eliminar produto", "5 salir", "Escriba la opcion: ");
                option = tcl.nextInt();
            }
            rt = false;
            switch (option) {
                case 1:
                    System.out.println("Ingresar nombre del producto:");
                    pro[produc][0] = tcl.next();
                    System.out.println("Ingresar precio:");
                    pro[produc][1] = tcl.next();
                    System.out.println("Ingresar cantidad:");
                    pro[produc][2] = tcl.next();
                    produc++;
                    break;
                case 3:
                    System.out.println("Cual productos busca");
                    busca = tcl.next();
                    for (int i = 0; i < pro.length; i++) {
                        if (busca.equals(pro[i][0])) {
                            System.out.println("Producto: " + busca);
                            System.out.println("Precio: " + pro[i][1]);
                            System.out.println("Cantidad: " + pro[i][2]);
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
                case 2:
                    System.out.println("Cual productos desea actualizar");
                    act = tcl.next();
                    for (int i = 0; i < pro.length; i++) {
                        if (act.equals(pro[i][0])) {
                            System.out.println("Ingresar nuevo precio: ");
                            pro[i][1] = tcl.next();
                            System.out.println("Ingresar nueva cantidad: ");
                            pro[i][2] = tcl.next();
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
                    System.out.println("Ingresar producto a eliminar");
                    busca = tcl.next();
                    for (int i = 0; i < pro.length; i++) {
                        if (busca.equals(pro[i][0])) {
                            pro[i][0] = " ";
                            pro[i][0] = " ";
                            pro[i][0] = " ";
                            produc--;
                            rt=false;
                            break;
                        } else {
                        rt=true;
                        }
                    }
                    if (rt) {
                        System.out.println("No se encontro el producto");
                    }

                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    c=1;
                    break;
                default:
                    System.out.println("Intente de nuevo");
            }

        }
        System.out.println("Salida exitosa");
    }
}
/*run:
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
1
Ingresar nombre del producto:
galleta
Ingresar precio:
10
Ingresar cantidad:
12
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
1
Ingresar nombre del producto:
doritos
Ingresar precio:
12,1
Ingresar cantidad:
42
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
1
Ingresar nombre del producto:
manzana
Ingresar precio:
445
Ingresar cantidad:
9,1
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
1
Ingresar nombre del producto:
banana
Ingresar precio:
31
Ingresar cantidad:
90
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
2
Cual productos desea actualizar
oreo
no se encontro el producto
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
2
Cual productos desea actualizar
doritos
Ingresar nuevo precio: 
10
Ingresar nueva cantidad: 
321
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
3
Cual productos busca
galleta
Producto: galleta
Precio: 10
Cantidad: 12
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
4
Ingresar producto a eliminar
banana
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
3
Cual productos busca
banana
no se encontro el producto
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 
5
Saliendo del sistema...
Salida exitosa
BUILD SUCCESSFUL (total time: 1 minute 30 seconds)
*/
/*Ejercicio 1
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar
 * su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.

 * @author Andrés
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim = 0;
        System.out.print("Deme el limite: ");
        lim = tcl.nextInt();
        int[][] pe = new int[lim][lim];

        for (int i = 0; i < pe.length; i++) {
            for (int j = 0; j < pe[0].length; j++) {
                pe[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + pe[i][j] + " ] ");

            }
            System.out.println(" ");
        }
        System.out.println("\nDiagonal princilal obvia");

        for (int i = 0; i < pe.length; i++) {
            for (int j = 0; j < pe[0].length; j++) {
                if (i == j) {
                    System.out.print(pe[i][j] + " \t");

                }
            }

        }
        System.out.println("\nDiagonal princilal eficiente");
        for (int i = 0; i < pe.length; i++) {
            System.out.print(pe[i][i] + "\t");

        }
        System.out.println("\nDiagonal secundaria obvia");
        for (int i = 0; i < pe.length; i++) {
            for (int j = 0; j < pe.length; j++) {
                if ((i + j) == pe.length - 1) {
                    System.out.print(pe[i][j] + "\t");
                }
            }
        }
        System.out.println("\nDiagonal secundaria eficiente");

        for (int i = 0; i < pe.length; i++) {
            System.out.print(pe[i][pe.length - 1 - i] + "\t");

        }

        System.out.println("\nTriangulo principal obvia");
        for (int i = 0; i < pe.length; i++) {
            for (int j = 0; j < pe[0].length; j++) {

                if (i > j) {
                    System.out.print(pe[i][j] + " ");
                    if ((i - 1) == j) {
                        System.out.println(" ");
                    }
                }

            }

        }

        System.out.println("\nTriangulo principal eficiente");
        for (int i = 1; i < pe.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(pe[i][j]);

            }

        }
        System.out.println("\n Triangulo principal (izquierda)");
        for (int i = 0; i < pe[0].length - 1; i++) {
            for (int j = 0; j < pe.length - 1 - i; j++) {
                System.out.print(pe[i][j] + "\t");
            }

        }
        System.out.println("\nTriangulo invertido secundario ");
        for (int j = pe.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print(pe[i][j] + "\t");
            }
        }
        System.out.println("\n Triangulo segundario(izquierda abajo)");
        for (int i = 1; i < pe.length; i++){
            for (int j = pe[0].length-1; i+j > pe.length-1 ; j--)  {
                System.out.print(pe[i][j]+"\t");

            }

        }
        System.out.println(" ");
    }
}
/*run:
Deme el limite: 3
[ 0 ] [ 7 ] [ 7 ]  
[ 1 ] [ 6 ] [ 3 ]  
[ 2 ] [ 3 ] [ 2 ]  

Diagonal princilal obvia
0 	6 	2 	
Diagonal princilal eficiente
0	6	2	
Diagonal secundaria obvia
7	6	2	
Diagonal secundaria eficiente
7	6	2	
Triangulo principal obvia
1  
2 3  

Triangulo principal eficiente
123
 Triangulo principal (izquierda)
0	7	1	
Triangulo invertido secundario 
7	3	7	
 Triangulo segundario(izquierda abajo)
3	2	3	 
BUILD SUCCESSFUL (total time: 3 seconds)
*/
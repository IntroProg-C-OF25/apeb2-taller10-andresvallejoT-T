
import java.util.Scanner;

/**
 * Ejercicio 2 Dadas dos matrices (cuadradas y/o rectangulares) de valores
 * enteros aleatorios, desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices (considerar las restricciones matemáticas para
 * ello). La multiplicación de las dos matrices (considerar las reglas
 * matemáticas para ello).
 *
 * @author Andrés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int m, n, q, e;
        String rt;
        System.out.println("Ingresar las fials y columnas de la primera matriz:");
        m = tcl.nextInt();
        n = tcl.nextInt();
        System.out.println("Ingresar las filas y columnas de la segunda matriz:");
        q = tcl.nextInt();
        e = tcl.nextInt();
        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[q][e];
        int[][] sum = new int[m][n];
        int[][] mult = new int[m][e];

        System.out.println("Primera matriz");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + mat1[i][j] + " ] ");
            }
            System.out.println("");
        }
        System.out.println("Segunda matriz");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                mat2[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + mat2[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        System.out.println("Desea sumarlas multiplicacion o ambas?");
        rt = tcl.next();
        switch (rt) {
            case "suma":
                if ((m == q) && (n == e)) {
                    for (int i = 0; i < mat1.length; i++) {
                        for (int j = 0; j < mat1[0].length; j++) {
                            sum[i][j] = mat1[i][j] + mat2[i][j];
                            System.out.print("[ " + sum[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("No puede realizarce la suma ya que las matricez son diferentes");
                }

                break;
            case "multiplicacion":
                if (n == q) {
                    for (int i = 0; i < mat1.length; i++) {
                        for (int j = 0; j < mat2[0].length; j++) {
                            for (int k = 0; k < mat2.length; k++) {
                                mult[i][j] += mat1[i][k] * mat2[k][j];
                            }
                        }
                    }
                    for (int i = 0; i < mult.length; i++) {
                        for (int j = 0; j < mult[0].length; j++) {
                            System.out.print("[ " + mult[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("Imposible multiplicar");
                }

                break;
            case "ambas":
                if ((m == q) && (n == e)) {
                    System.out.println("Suma");
                    for (int i = 0; i < mat1.length; i++) {
                        for (int j = 0; j < mat1[0].length; j++) {
                            sum[i][j] = mat1[i][j] + mat2[i][j];
                            System.out.print("[ " + sum[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("No puede realizarce la suma ya que las matricez son diferentes");
                }System.out.println("");
                if (n == q) {
                    System.out.println("Multiplicacion");
                    for (int i = 0; i < mat1.length; i++) {
                        for (int j = 0; j < mat2[0].length; j++) {
                            for (int k = 0; k < mat2.length; k++) {
                                mult[i][j] += mat1[i][k] * mat2[k][j];
                            }
                        }
                    }
                    for (int i = 0; i < mult.length; i++) {
                        for (int j = 0; j < mult[0].length; j++) {
                            System.out.print("[ " + mult[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("Imposible multiplicar");
                }

                break;

            default:
                System.out.println("no");
        }
    }

}
/*run:
Ingresar las fials y columnas de la primera matriz:
4 5
Ingresar las filas y columnas de la segunda matriz:
5 3
Primera matriz
[ 0 ] [ 2 ] [ 6 ] [ 1 ] [ 8 ] 
[ 2 ] [ 6 ] [ 3 ] [ 3 ] [ 8 ] 
[ 4 ] [ 0 ] [ 6 ] [ 9 ] [ 4 ] 
[ 5 ] [ 0 ] [ 1 ] [ 5 ] [ 6 ] 
Segunda matriz
[ 6 ] [ 9 ] [ 9 ]  
[ 9 ] [ 9 ] [ 7 ]  
[ 5 ] [ 9 ] [ 4 ]  
[ 0 ] [ 7 ] [ 9 ]  
[ 0 ] [ 5 ] [ 7 ]  
Desea sumarlas multiplicacion o ambas?
ambas
No puede realizarce la suma ya que las matricez son diferentes
[ 48 ] [ 119 ] [ 103 ]  
[ 81 ] [ 160 ] [ 155 ]  
[ 54 ] [ 173 ] [ 169 ]  
[ 35 ] [ 119 ] [ 136 ]  
BUILD SUCCESSFUL (total time: 15 seconds)
*/
/*run:
Ingresar las fials y columnas de la primera matriz:
3 3
Ingresar las filas y columnas de la segunda matriz:
3 3
Primera matriz
[ 9 ] [ 3 ] [ 7 ] 
[ 1 ] [ 2 ] [ 9 ] 
[ 4 ] [ 0 ] [ 7 ] 
Segunda matriz
[ 2 ] [ 0 ] [ 7 ]  
[ 6 ] [ 6 ] [ 3 ]  
[ 1 ] [ 9 ] [ 0 ]  
Desea sumarlas multiplicacion o ambas?
ambas
Suma
[ 11 ] [ 3 ] [ 14 ]  
[ 7 ] [ 8 ] [ 12 ]  
[ 5 ] [ 9 ] [ 7 ]  

Multiplicacion
[ 43 ] [ 81 ] [ 72 ]  
[ 23 ] [ 93 ] [ 13 ]  
[ 15 ] [ 63 ] [ 28 ]  
BUILD SUCCESSFUL (total time: 5 seconds)*/
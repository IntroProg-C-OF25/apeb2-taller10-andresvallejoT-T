
import java.util.Scanner;

/*Ejercicio 6
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. 
 * Permita a dos jugadores marcar sus movimientos alternativamente.
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 * @author Andrés
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[][] raya = new String[3][3];
        boolean que = true, so = true, ra = true, pe;
        String rt;
        int c, t, bot, bot2;
        while (que) {
            System.out.println("Desea jugar?");
            rt = tcl.next();
            if (rt.equals("si")) {
                for (int i = 0; i < raya.length; i++) {
                    for (int j = 0; j < raya.length; j++) {
                        System.out.print("{  }");
                        raya[i][j] = " ";
                    }
                    System.out.println(" ");
                }
                while (so) {
                    System.out.println("Ingresa cordenadas ");
                    c = tcl.nextInt();
                    t = tcl.nextInt();
                    raya[c][t] = "x";
                    for (int i = 0; i < raya.length; i++) {
                        for (int j = 0; j < raya.length; j++) {
                            System.out.print("{ " + raya[i][j] + " }");

                        }
                        System.out.println(" ");
                    }
                    bot = (int) (Math.random() * 3);
                    bot2 = (int) (Math.random() * 3);
                    ra = true;
                    while (ra) {
                        if (raya[bot][bot2].equals(("x"))) {
                            bot = (int) (Math.random() * 3);
                            bot2 = (int) (Math.random() * 3);
                        } else if (raya[bot][bot2].equals(("O"))) {
                            bot = (int) (Math.random() * 3);
                            bot2 = (int) (Math.random() * 3);
                        } else {
                            raya[bot][bot2] = "O";
                            ra = false;
                        }
                    }
                    System.out.println("-o-o-o-o-o-o-o-o-o-o-o-");
                    for (int i = 0; i < raya.length; i++) {
                        for (int j = 0; j < raya.length; j++) {
                            System.out.print("{ " + raya[i][j] + " }");

                        }
                        System.out.println(" ");
                    }
                    pe = true;
                    while (pe) {

                        if ((raya[0][0].equals(raya[1][1]) && (raya[1][1].equals(raya[2][2])))) {
                            if (raya[0][0].equals("x")) {
                                System.out.println("ganaste");
                                que = false;
                                so = false;
                                pe = false;
                            } else if (raya[0][0].equals("O")) {
                                System.out.println("ganaste");
                                que = false;
                                so = false;
                                pe = false;

                            }
                            if ((raya[0][2].equals(raya[1][1]) && (raya[1][1].equals(raya[2][0])))) {
                                if (raya[0][2].equals("x")) {
                                    System.out.println("ganaste");
                                    que = false;
                                    so = false;
                                    pe = false;
                                } else if (raya[0][2].equals("O")) {
                                    System.out.println("ganaste");
                                    que = false;
                                    so = false;
                                    pe = false;

                                }

                            }

                        }
                        for (int i = 0; i < raya.length; i++) {

                            if (raya[i][0].equals(raya[i][1])) {
                                if (raya[i][2].equals(raya[i][0])) {
                                    if (raya[i][0].equals("x")) {
                                        System.out.println("Ganaste");
                                        que = false;
                                        so = false;
                                        pe = false;
                                    } else if (raya[i][0].equals("O")) {
                                        System.out.println("Perdiste");
                                        que = false;
                                        so = false;
                                        pe = false;
                                    }
                                }
                            }
                            if (raya[0][i].equals(raya[1][i])) {
                                if (raya[2][i].equals(raya[0][i])) {
                                    if (raya[0][i].equals("x")) {
                                        System.out.println("Ganaste");
                                        que = false;
                                        so = false;
                                        pe = false;
                                    } else if (raya[0][i].equals("O")) {
                                        System.out.println("Perdiste");
                                        que = false;
                                        so = false;
                                        pe = false;
                                    }
                                }
                            }
                            if (raya[0][2].equals(raya[1][1])) {
                                if (raya[2][0].equals(raya[1][1])) {
                                    if (raya[0][i].equals("x")) {
                                        System.out.println("Ganaste");
                                        que = false;
                                        so = false;
                                        pe = false;
                                    } else if (raya[0][i].equals("O")) {
                                        System.out.println("Perdiste");
                                        que = false;
                                        so = false;
                                        pe = false;
                                    }
                                }
                            }

                        }
                        pe = false;

                    }
                }
            }
        }
    }
}
/*run:
Desea jugar?
si
{  }{  }{  } 
{  }{  }{  } 
{  }{  }{  } 
Ingresa cordenadas 
0 2
{   }{   }{ x } 
{   }{   }{   } 
{   }{   }{   } 
-o-o-o-o-o-o-o-o-o-o-o-
{   }{   }{ x } 
{   }{   }{   } 
{   }{   }{ O } 
Ingresa cordenadas 
1 1
{   }{   }{ x } 
{   }{ x }{   } 
{   }{   }{ O } 
-o-o-o-o-o-o-o-o-o-o-o-
{   }{   }{ x } 
{   }{ x }{   } 
{   }{ O }{ O } 
Ingresa cordenadas 
2 0
{   }{   }{ x } 
{   }{ x }{   } 
{ x }{ O }{ O } 
-o-o-o-o-o-o-o-o-o-o-o-
{   }{   }{ x } 
{ O }{ x }{   } 
{ x }{ O }{ O } 
Ganaste
BUILD SUCCESSFUL (total time: 19 seconds)
*/

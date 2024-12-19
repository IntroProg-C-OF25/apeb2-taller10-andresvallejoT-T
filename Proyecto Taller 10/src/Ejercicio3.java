
/** Ejercicio 3
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo,
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia
 * INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben
 * calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones
 * (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%).
 * En resumen, los requerimientos son los siguientes:
 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente
 * ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio
 * por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio
 * por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 *
 * @author Andrés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String[] name = {"Andrea", "Carlos", "Daniela", "Fernando", "Gabriela", "Héctor", "Isabel", "Javier", "Karla", "Luis", "María", "Natalia", "Óscar", "Paula", "Quintín", "Raquel", "Santiago", "Tatiana", "Ulises", "Valeria", "Walter", "Ximena", "Yolanda", "Zacarías", "Ángela", "Benjamín", "Camila", "Diego"};
        double[] acd = new double[name.length];
        double[] ape = new double[name.length];
        double[] aa = new double[name.length];
        double[] prom = new double[name.length];
        double max = 0, men = 10, total = 0;
        int n = 0, n2 = 0, cont = 0, cont2 = 0;
        for (int i = 0; i < name.length; i++) {
            acd[i] = (double) (Math.random() * 10);
            ape[i] = (double) (Math.random() * 10);
            aa[i] = (double) (Math.random() * 10);
            prom[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.3);
            total += prom[i];
            if (max < prom[i]) {
                max = prom[i];
                n = i;
            }
            if (men > prom[i]) {
                men = prom[i];
                n2 = i;
            }

        }
        total /= 28;
        for (int j = 0; j < name.length; j++) {
            if (prom[j] < total) {
                cont++;
            } else {
                cont2++;
            }
        }
        System.out.printf("%s%.2f%n", "el promedio del curso es: ", total);
        for (int i = 0; i < prom.length; i++) {
            if (prom[i] >= total) {
                System.out.printf("%s%s%.2f%s%.2f%s%.2f%s%.2f%s%n", name[i], " ACD", acd[i], " APE", ape[i], " AA ", aa[i], "PROMEDIO: ", prom[i], " Encima del promedio del curso");
            } else {
                System.out.printf("%s%s%.2f%s%.2f%s%.2f%s%.2f%s%n", name[i], " ACD", acd[i], " APE", ape[i], " AA ", aa[i], "PROMEDIO: ", prom[i], " Por debajo del promedio del curso");

            }

        }
        System.out.println("Existen: " + cont + " por ensima del promedio\n" + "Existen: " + cont2 + " Por debajo del promedio");
        System.out.printf("%s%s%s%.2f%s%s%s%.2f%n","El mejor estudiantes es: " , name[n] , " con: " , prom[n] , "\nEl peor es: " , name[n2] , " con: " , prom[n2]);
    }
}
/*run:
el promedio del curso es: 5,31
Andrea ACD8,75 APE9,84 AA 2,99PROMEDIO: 7,40 Encima del promedio del curso
Carlos ACD2,13 APE2,83 AA 5,72PROMEDIO: 3,46 Por debajo del promedio del curso
Daniela ACD9,57 APE7,10 AA 2,30PROMEDIO: 6,52 Encima del promedio del curso
Fernando ACD3,38 APE0,05 AA 6,32PROMEDIO: 3,10 Por debajo del promedio del curso
Gabriela ACD6,94 APE3,65 AA 6,67PROMEDIO: 5,71 Encima del promedio del curso
H�ctor ACD5,11 APE3,95 AA 9,91PROMEDIO: 6,14 Encima del promedio del curso
Isabel ACD3,62 APE2,03 AA 0,04PROMEDIO: 1,99 Por debajo del promedio del curso
Javier ACD4,91 APE2,10 AA 7,94PROMEDIO: 4,83 Por debajo del promedio del curso
Karla ACD3,99 APE4,69 AA 8,06PROMEDIO: 5,46 Encima del promedio del curso
Luis ACD7,32 APE6,69 AA 9,04PROMEDIO: 7,62 Encima del promedio del curso
Mar�a ACD4,59 APE8,12 AA 4,76PROMEDIO: 5,87 Encima del promedio del curso
Natalia ACD3,87 APE9,07 AA 8,00PROMEDIO: 6,93 Encima del promedio del curso
�scar ACD4,28 APE1,45 AA 1,85PROMEDIO: 2,56 Por debajo del promedio del curso
Paula ACD7,62 APE5,62 AA 0,75PROMEDIO: 4,86 Por debajo del promedio del curso
Quint�n ACD6,91 APE3,68 AA 6,59PROMEDIO: 5,68 Encima del promedio del curso
Raquel ACD1,69 APE7,09 AA 7,57PROMEDIO: 5,34 Encima del promedio del curso
Santiago ACD1,14 APE3,70 AA 6,19PROMEDIO: 3,55 Por debajo del promedio del curso
Tatiana ACD8,90 APE2,79 AA 1,44PROMEDIO: 4,52 Por debajo del promedio del curso
Ulises ACD7,38 APE6,23 AA 7,52PROMEDIO: 7,02 Encima del promedio del curso
Valeria ACD7,53 APE3,36 AA 1,60PROMEDIO: 4,29 Por debajo del promedio del curso
Walter ACD8,38 APE5,34 AA 6,07PROMEDIO: 6,62 Encima del promedio del curso
Ximena ACD9,31 APE5,39 AA 2,64PROMEDIO: 5,94 Encima del promedio del curso
Yolanda ACD5,29 APE4,13 AA 7,36PROMEDIO: 5,50 Encima del promedio del curso
Zacar�as ACD0,30 APE4,01 AA 8,57PROMEDIO: 4,08 Por debajo del promedio del curso
�ngela ACD9,17 APE9,12 AA 4,89PROMEDIO: 7,86 Encima del promedio del curso
Benjam�n ACD4,29 APE6,96 AA 1,58PROMEDIO: 4,41 Por debajo del promedio del curso
Camila ACD6,78 APE7,76 AA 5,81PROMEDIO: 6,83 Encima del promedio del curso
Diego ACD4,89 APE2,31 AA 6,42PROMEDIO: 4,45 Por debajo del promedio del curso
Existen: 12 por ensima del promedio
Existen: 16 Por debajo del promedio
El mejor estudiantes es: �ngela con: 7,86
El peor es: Isabel con: 1,99
BUILD SUCCESSFUL (total time: 0 seconds)*/

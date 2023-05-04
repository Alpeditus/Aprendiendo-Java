/*
Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las 
ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad 
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.

 */
package extra.pkg4;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double[] alumno = new double[10];

        llenadoVector(alumno);
        System.out.println("");
        resultado(alumno);

    }

    public static double[] llenadoVector(double[] alumno) {

        int ptp, stp, pi, si;

        for (int i = 0; i < alumno.length; i++) {
            System.out.println("A continuación ingrese las notas del alumno n° " + (i + 1));
            System.out.print("Primer trabajo práctico: ");
            ptp = sc.nextInt();
            System.out.print("Segundo trabajo práctico: ");
            stp = sc.nextInt();
            System.out.print("Primer integrador: ");
            pi = sc.nextInt();
            System.out.print("Segundo integrador: ");
            si = sc.nextInt();
            alumno[i] = ptp * 0.1 + stp * 0.15 + pi * 0.25 + si * 0.5;
        }
        return alumno;
    }

    public static void resultado(double[] alumno) {

        int aprobado = 0, desaprobado = 0;
        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i] >= 7) {
                aprobado++;
            } else {
                desaprobado++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados son: " + aprobado);
        System.out.println("La cantidad de alumnos desaprobados son: " + desaprobado);
    }
}

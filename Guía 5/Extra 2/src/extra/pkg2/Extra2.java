/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
los elementos).
 */
package extra.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el tamaño de los dos vectores: ");
        int num = sc.nextInt();
        int[] vector1 = new int[num];
        int[] vector2 = new int[num];

        llenarVector(vector1, vector2);
        
        System.out.println("Vector n° 1: ");
        imprimirVector(vector1);
        System.out.println("");
        System.out.println("Vector n° 2: ");
        imprimirVector(vector2);

        System.out.println("");
        
        if (comparaVector(vector1, vector2)) {
            System.out.println("Los vectores no son iguales.");
        } else {
            System.out.println("Los vectores son iguales.");
        }
    }

    public static void llenarVector(int[] vector1, int[] vector2) {

        Random azar = new Random();
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = azar.nextInt(4) + 1;
            vector2[i] = azar.nextInt(4) + 1;
        }

    }
    
    public static int [] imprimirVector(int []vector){
    
        for (int i = 0; i < vector.length; i++) {
            System.out.print("|" + vector[i] + "|");
        }
        return vector;
    }

    public static boolean comparaVector(int[] vector1, int[] vector2) {
        boolean comparar = false;

        for (int i = 0; i < vector1.length; i++) {
            while (vector1[i] != vector2[i]) {
                comparar = true;
                break;
            }
        }
        return comparar;
    }
}

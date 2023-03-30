/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se 
dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).
 */
package ejercicio.pkg5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int [][] matriz=new int [3][3];
        int [][] matrizt=new int [3][3];
        
        llenarMatriz(matriz);
        traspuesta (matriz,matrizt);
        imprimirMatriz (matriz,matrizt);
        antisimétrica(matriz,matrizt);
    }
    
    public static void llenarMatriz(int[][] matriz) {
        Random azar = new Random();
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = azar.nextInt(3)-1;
            }
        }
    }
    
    public static void traspuesta (int [][]matriz,int [][]matrizt){
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizt[i][j]=matriz[j][i];
            }
        }
    
    }
    
    public static void imprimirMatriz (int [][]matriz,int [][]matrizt){
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz trapuesta: ");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matrizt[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void antisimétrica(int[][] matriz, int[][] matrizt) {
        boolean comparacion = false;
        int v1, v2;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                v1 = matriz[i][j];
                v2 = matrizt[i][j];
                if (v1 == (v2 * -1)) {
                    comparacion = true;
                    break;
                }
            }
        }
        if (comparacion = true) {
            System.out.println("La matriz no es antisimétrica.");
        } else {
            System.out.println("La matriz es antisimétrica.");
        }
    }
}

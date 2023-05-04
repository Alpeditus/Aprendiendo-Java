/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio.pkg4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int [][] matriz=new int [4][4];
        int [][] matrizt=new int [4][4];
        
        llenarMatriz(matriz);
        traspuesta (matriz,matrizt);
        imprimirMatriz (matriz,matrizt);
    }
    
    public static void llenarMatriz(int [][]matriz){
    Random azar = new Random();
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=azar.nextInt(10);
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
}

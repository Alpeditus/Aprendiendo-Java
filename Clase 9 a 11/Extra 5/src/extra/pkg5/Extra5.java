/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
 */
package extra.pkg5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de filas para la matriz: ");
        int n=sc.nextInt();
        System.out.print("Ingrese cantidad de columnas para la matriz: ");
        int m=sc.nextInt();
        System.out.println("");
        
        int [][]matriz=new int [n][m];
        
        llenadoMatriz(matriz,n,m);
        System.out.println("Matriz M = ");
        imprimirMatriz(matriz,n,m);
    }
    
    public static int [][] llenadoMatriz(int [][]matriz,int n,int m){
    
        Random azar=new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=azar.nextInt(5)+1;
            }
        }
        return matriz;
    }
    
    public static void imprimirMatriz(int [][]matriz,int n, int m){
    
        int suma=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma+=matriz[i][j];
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma de los valores de la matriz es " + suma + ".");
    }
}

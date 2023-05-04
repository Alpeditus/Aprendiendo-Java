/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.
 */
package extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Ingrese el tamaño de la matriz: ");
        int num=sc.nextInt();
        int [] vector=new int [num];
        
        llenarMatriz(vector);
        imprimirVector(vector);
        System.out.println("");
    }
    
    public static int[] llenarMatriz(int []vector){
    
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el valor para el subíndice " + i + ": ");
            vector[i]=sc.nextInt();
        }
        return vector;
    }
    
    public static void imprimirVector(int []vector){
        int suma=0;
        
        System.out.print("La matriz ingresada es: V = ");
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.print("La suma de los valores del vector es: " + suma);
    }
}

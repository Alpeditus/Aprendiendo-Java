/*
Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que 
imprima el vector.
 */
package extra.pkg3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Ingrese el tamaño de los dos vectores: ");
        int num = sc.nextInt();
        int[] vector1 = new int[num];
        
        llenarVector(vector1);
        imprimirVector(vector1);
        System.out.println("");
    }
    
    public static void llenarVector(int[] vector1) {

        Random azar = new Random();
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = azar.nextInt(10) + 1;            
        }
    }
    
     public static int [] imprimirVector(int []vector){
    
         System.out.print("V = ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("|" + vector[i] + "|");
        }
        return vector;
    }
}

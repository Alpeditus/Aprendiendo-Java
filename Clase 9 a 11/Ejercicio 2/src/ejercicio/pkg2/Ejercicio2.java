/*
Realizar un algotirmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El programa 
mostrará donde se encuentra el número y si se encunetra repetido.
 */
package ejercicio.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    public static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        int [] vector=numeroAleatorio();
        buscarNumero (vector);
    }
    
    public static int [] numeroAleatorio(){
        System.out.print("Ingrese el tamaño del vector: ");
        int n=sc.nextInt();
        Random azar=new Random(); // Para generar números aleatorios. 
        int [] vector=new int [n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=azar.nextInt(100);
        }
        mostrarVector(vector);
        return vector;
    }
    
    public static void buscarNumero(int [] vector){
        System.out.print("Que número desea buscar? ");
        boolean encontrado=false;
        int num=sc.nextInt(),cont=0;
        
        for (int i = 0; i < vector.length ; i++) {
            if (num==vector[i]) {
                System.out.println("Posición: " + i);
                cont++;
                encontrado=true;
                
            }
        }
        if (cont==1) {
            System.out.println("El número aparece " + cont + " vez.");
        }else{
        System.out.println("El número aparece " + cont + " veces.");
        }
    }
    
    public static void mostrarVector(int [] vector){
        for (int i = 0; i < vector.length ; i++) {
            System.out.println(vector [i]);
        }
    }
}

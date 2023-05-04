// Crear un programa que dado un número determine si es par o impar.

package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int num;
        
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        
        if (num%2==0) {
            System.out.println("Su número es par.");
        
        }
        
        else {System.out.println("Su número es impar.");
        
        }
        
    }
    
}

/*
 Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package extra.pkg6;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas: ");
        double num=sc.nextInt();
        double enano=0,suma=0;
        double total=0;
        
        for (double i = 0; i < num; i++) {
            System.out.print("Ingrese la estatura en cm de la persona n° " + (i+1) + ":");
            double num2=sc.nextInt();
            
            suma+=num2;
                               
            if (num2<160) {
                enano+=num2;
                total+=1;
            }                
        }
        System.out.println("El promedio de estatura de personas menores a 160cm es: " + enano/total);
        System.out.println("El promedio de estatura total es: " + suma/num);
    }
    
}

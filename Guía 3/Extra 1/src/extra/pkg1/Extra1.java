/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese tiempo en minutos: ");
        int minuto=sc.nextInt();
        int dia=minuto/1440;
        int hora=minuto/60;
        while (hora>24) {
            hora-=24;
        }
        while (minuto>60) {
            minuto-=60;
        }
        
        System.out.println("Los minutos ingresados son " + dia + " día, " + hora + " horas y " + minuto + " minutos.");
      
    }
    
}

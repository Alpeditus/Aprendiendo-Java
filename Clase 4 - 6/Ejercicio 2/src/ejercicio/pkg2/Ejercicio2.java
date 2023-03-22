/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
Incorrecto. Nota: investigar la función equals() en Java.
*/
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        String frase;
        System.out.print("Ingrese una frase: ");
        frase=sc.nextLine();
        
        if (frase.equals("eureka")) {
                System.out.println("Correcto");
        } else {
                System.out.println("Incorrecto");
        }
    }
    
}

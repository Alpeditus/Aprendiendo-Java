/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si 
se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
la función equals() de la clase String.
 */
package extra.pkg3;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una letra: ");
        String letra=sc.nextLine().toUpperCase();
        
        if (letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")) {
            System.out.println("Su letra es una vocal.");
        } else {
            System.out.println("Su letra es una consonante.");
        }
    }
    
}

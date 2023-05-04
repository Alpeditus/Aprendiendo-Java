/*
 * Realizar un programa que solo permita introducir solo frases 
   o palabras de 8 de largo. Si el usuario ingresa una frase o 
   palabra de 8 de largo se deberá de imprimir un mensaje por 
   pantalla que diga “CORRECTO”, en caso contrario, se 
   deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        String frase;
        System.out.print("Ingrese una frase: ");
        frase=sc.nextLine();
        
        if (frase.length()!=8) {
            System.out.println("Incorrecto.");
        } else {
            System.out.println("Correcto.");
        }
        
    }
    
}

/*
 * Escriba un programa que pida una frase o palabra y valide 
   si la primera letra de esa frase es una ‘A’. Si la primera 
   letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
   que diga “CORRECTO”, en caso contrario, se deberá imprimir 
   “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        frase=sc.nextLine();
        
        if (frase.substring(0, 1).toUpperCase().equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}

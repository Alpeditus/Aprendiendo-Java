/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. \n" +
"Nota: investigar la función toUpperCase() y toLowerCase() en Java.");
        
        Scanner sc=new Scanner (System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        
        System.out.println("La frase en mayúscula es: " + frase.toUpperCase());
        System.out.println("La frase en minúscula es: " + frase.toLowerCase());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner sc=new Scanner (System.in);
    
        System.out.println("Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).");
        
        double centigrado;
        
        System.out.print("Ingrese la temperatura en centigrado: ");    
        centigrado = sc.nextDouble();
        
        
        double fahrenheit = 32 + (9 * centigrado / 5);
        
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
            
        
    }
    
}

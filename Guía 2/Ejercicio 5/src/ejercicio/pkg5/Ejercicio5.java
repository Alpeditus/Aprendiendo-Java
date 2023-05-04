/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. \n" +
"Nota: investigar la función Math.sqrt().");
        
        Scanner sc=new Scanner (System.in);
        
        int num1;
        
        System.out.print("Ingrese un número: ");
        
        num1 = sc.nextInt();
                
        System.out.println("El doble es: " + num1 * 2);
        System.out.println("El triple es: " + num1 * 3);
        System.out.println("La raíz cuadrada es: " + Math.sqrt(num1));
        
        
    }
    
}

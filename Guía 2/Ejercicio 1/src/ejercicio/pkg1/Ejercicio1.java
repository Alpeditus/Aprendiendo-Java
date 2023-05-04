/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        // TODO code application logic here
        
        System.out.println("Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma");
        
        Scanner sc=new Scanner (System.in);
        int num1;
        int num2;

        
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los números es: " + suma);
        
    }
    
}

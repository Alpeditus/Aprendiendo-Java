/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.");
        Scanner sc=new Scanner (System.in);
        
        //Dato y nombre de la variable.
        String nombre;
        
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
        
    }
    
}

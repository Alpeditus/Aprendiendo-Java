/*
Crea una aplicación que le pida dos números al usuario y este pueda 
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
tener una función para cada operación matemática y deben devolver sus 
resultados para imprimirlos en el main.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author  Cristian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int num1,num2,opcion;
        System.out.println("Ingrese 2 números: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Ingrese opción deseada: ");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
        opcion=sc.nextInt();
        
        operaciones(opcion,num1,num2);
    }
    public static int operaciones (int opcion,int num1,int num2){
        switch (opcion) {
            case 1: int sumar=num1+num2;       
                System.out.println("La suma es: "+sumar);
            return sumar;
            case 2: int restar=num1-num2;                
            System.out.println("La resta es: "+restar);
            return restar;
            case 3: int multiplicar=num1*num2;      
            System.out.println("La multiplicación es: "+multiplicar);
            return multiplicar;
            case 4: int dividir=num1/num2;                
            System.out.println("La división es: "+dividir);
            return dividir;                
            default:
                System.out.println("Opción incorrecta.");
        }
        return 0;
    }
}

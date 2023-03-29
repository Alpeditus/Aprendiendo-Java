/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por 
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejercicio.guía.pkgfor;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class EjercicioGuíaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,n2,n3,n4;
                       
        System.out.println("Ingrese 4 números comprendidos entre 1 y 20: ");
        n=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        
        System.out.print(n);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n2);
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n3);
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(n4);
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}

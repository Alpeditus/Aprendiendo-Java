/*
 Escriba un programa en el cual se ingrese un valor límite 
 positivo, y a continuación solicite números al usuario hasta 
 que la suma de los números introducidos supere el límite inicial.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int num, limite, suma;
        System.out.print("Ingrese un número límite");
        limite=sc.nextInt();
        suma=0;
        
        while (suma<limite){
            System.out.println("Ingrese un número");
            num=sc.nextInt();
            suma+=num; //suma+=num -> suma=suma + num
            System.out.println(suma);
        }
        
    }
    
}

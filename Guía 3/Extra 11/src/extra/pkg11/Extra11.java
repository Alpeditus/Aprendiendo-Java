/*
 Escribir un programa que lea un número entero y devuelva el número de 
dígitos que componen ese número. Por ejemplo, si introducimos el 
número 12345, el promgrama debrá devolver 5. Calcular la cantidad de 
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o resultados.
 */
package extra.pkg11;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,cont=0;
        
        System.out.print("Ingrese cualquier número: ");
        n=sc.nextInt();
        
        do {
            n/=10;
            cont++;
        } while (n>0);
        
        System.out.println("La cantidad de dígitos que tiene el número es " + cont);
    }
    
}

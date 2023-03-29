/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas
es el cociente.
 */
package extra.pkg9;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int divisor,dividendo,cont=0;
        
        System.out.print("Ingrese dividor: ");
        divisor=sc.nextInt();
        System.out.print("Ingrese dividendo: ");
        dividendo=sc.nextInt();
        
        while (divisor>dividendo) {
            divisor-=dividendo;
            cont++;
        }
        
        System.out.println("El resultado de la división es " + cont + " con resto igual a " + divisor + ".");
        
    }
    
}

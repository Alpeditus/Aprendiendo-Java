/* Escriba un programa que lea números enteros. Si el número es múltiplo de
cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
cantidad de números pares y la cantidad de números impares. Al igual que en el 
ejercicio anterior los números negativos no deben sumarse. Nota: recordar el 
uso de la sentencia break.
 */
package extra.pkg8;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,i=1,leido=0,par=0,impar=0;
        
        System.out.println("A continuación se le pedirá una cierta cantidad de números.");
                
        do {
            System.out.print("Ingrese el número " + i++ + ". ");
            n=sc.nextInt();    
            
            if (n>=0) {
                if (n%2==0) {
                par++;
            }
            if (n%2!=0) {
                impar++;
            }
            leido++;
            }
        } while (n%5!=0);
        
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números impares: " + impar);
        System.out.println("Total de números: " + leido);
        System.out.println("No se tienen en cuenta los números negativos.");
    }
    
}

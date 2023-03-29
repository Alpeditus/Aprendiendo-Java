/* Realice un programa que calcule y visualice el valor máximo, el valor mímino 
y el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones
del programa, una usando el bucle "while" y otra con el bucle "do - while".
 */
package extra.pkg7;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        int max=0,min=1000,num,cont=0,i=1;
        double suma=0,n;
        
        System.out.print("Cuantos números desea ingresar? ");
        n=sc.nextDouble();
        
        while (n<=0) {
                System.out.print("Ingrese un número mayor a 0. ");
                n=sc.nextDouble();
            }
        
        // DO - WHILE
//        do {
//                     
//            System.out.print("Ingrese el número " + i++ + ". ");
//            num=sc.nextInt();
//            
//            if (num<min) {
//                min=num;
//            }
//            if (num>max) {
//                max=num;
//            }
//        suma+=num; 
//        cont++;
//            
//        } while (cont<n);

        // WHILE
        while (cont<n) {
            System.out.print("Ingrese el número " + i++ + ". ");
            num=sc.nextInt();
            
            if (num<min) {
                min=num;
            }
            if (num>max) {
                max=num;
            }
        suma+=num; 
        cont++;
        }
        
        System.out.println("El número mínimo ingresado es: " + min);
        System.out.println("El número máximo ingresado es: " + max);
        System.out.println("El promedio de los números ingresado es: " + suma/n);
    }
    
}

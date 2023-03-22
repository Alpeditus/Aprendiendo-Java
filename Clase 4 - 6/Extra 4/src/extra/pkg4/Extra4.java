/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y 
se muestre su equivalente en romano.
 */
package extra.pkg4;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número de 1 a 10:");
        int num=sc.nextInt();
                
        if (num<11 && num>0) {
            switch (num) {
                case 1:
                    System.out.println("Su número en romano es I.");
                    break;
                case 2:
                    System.out.println("Su número en romano es II.");
                    break;
                case 3:
                    System.out.println("Su número en romano es III.");
                    break;
                case 4:
                    System.out.println("Su número en romano es IV.");
                    break;
                case 5:
                    System.out.println("Su número en romano es V.");
                    break;
                case 6:
                    System.out.println("Su número en romano es VI.");
                    break;
                case 7:
                    System.out.println("Su número en romano es VII.");
                    break;
                case 8:
                    System.out.println("Su número en romano es VIII.");
                    break;
                case 9:
                    System.out.println("Su número en romano es IX.");
                    break;
                case 10:
                    System.out.println("Su número en romano es X.");
                    break;
                }
        }
    }
    
}

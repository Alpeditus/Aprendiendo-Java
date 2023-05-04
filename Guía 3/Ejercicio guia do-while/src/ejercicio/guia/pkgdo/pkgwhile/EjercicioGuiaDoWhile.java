package ejercicio.guia.pkgdo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class EjercicioGuiaDoWhile {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cont=1,n,i=1,suma=0;
        
            System.out.println("Se pedirá a continuación 20 números, uno en especial cortará abruptamente el programa.");
            do {
                System.out.print("Ingrese n° " + i++ + ": ");
                n=sc.nextInt();
                if (n==0) {
                    System.out.println("Se capturó el número 0");
                    break;
                }else if (n>0) {
                    suma+=n;
                    cont+=1;
                }
            } while (cont<=20);
            System.out.println("La suma de los números leídos es: " + suma);
        }
    
}

/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de 
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package extra.pkg14;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,M,edad;
        double suma=0,cont=0;
        
        System.out.print("Cuantas familias va a cargar: ");
        N=sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.print("Cuantos hijos tiene la familia n° " + (i+1) + ": ");
            M=sc.nextInt();
            for (int j = 0; j < M; j++) {
                System.out.print("Ingrese la edad del hijo n° " + (j+1) + ": ");
                edad=sc.nextInt();
                suma+=edad;
                cont++;
            }
        }
        System.out.println("La media de hijos de las " + N + " familias es: " + suma/cont);
    }
    
}

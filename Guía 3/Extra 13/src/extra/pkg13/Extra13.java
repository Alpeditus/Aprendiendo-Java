/*
 Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se 
ingresa el número 3:
1
12
123
 */
package extra.pkg13;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese el tamaño de la escalera: ");
        n=sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}

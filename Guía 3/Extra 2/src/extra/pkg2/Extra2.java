/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y 
D tome el valor de B. Mostrar los valores iniciales y los valores finales de 
cada variable. Utilizar sólo una variable auxiliar.
 */
package extra.pkg2;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A=0,B=1,C=2,D=3,aux;
     /* B=C
        C=A
        A=D
        D=B
     */
        System.out.println("El valor inicial de A: "+A);
        System.out.println("El valor inicial de B: "+B);
        System.out.println("El valor inicial de C: "+C);
        System.out.println("El valor inicial de D: "+D);
        System.out.println("");
        aux=A;
        A=D;
        D=B;
        B=C;
        C=aux;
        
        System.out.println("El valor final de A: "+A);
        System.out.println("El valor final de B: "+B);
        System.out.println("El valor final de C: "+C);
        System.out.println("El valor final de D: "+D);
    }
    
}

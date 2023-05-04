/*
Realice un programa para que el usuario adivine el resultado de una 
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es correcta o no. En 
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar 
su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java.
 */
package extra.pkg10;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,intento=0,respuesta;
        
        System.out.println("Adivine un número multiplicado por dos números entre 0 y 10.");
        respuesta=(int) (Math.random()*10);
        
        do {
            System.out.print("¿Que número cree ud que es el elegido? ");
            n=sc.nextInt();
            if (n!=respuesta) {
                System.out.println("Incorrecto, vuelva a intentar.");
            }
            intento++;
        } while (n!=respuesta);
        System.out.println("Correcto!!! Número de intentos: " + intento + ".");
    }
    
}

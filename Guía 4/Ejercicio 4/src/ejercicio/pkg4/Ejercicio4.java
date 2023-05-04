/*
 Crea una aplicación que nos pida un número por teclado y con una función se 
lo pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sií mismo. Por
ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si 
es primo.
 */
package ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        boolean respuesta=false;
        
        System.out.print("Ingrese un número para ver si es primo o no: ");
        n=sc.nextInt();
        
        //primo(n,respuesta);
        
        if (primo(n,respuesta)) {
            System.out.println("Su número es primo.");
        }else{
            System.out.println("Su número no es primo.");
        }
    }
    
    public static boolean primo(int n,boolean respuesta){
        int cont=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                cont++;
            }
            }
        if (cont==2) {
                respuesta=true;
        }
        return respuesta;    
    }
}

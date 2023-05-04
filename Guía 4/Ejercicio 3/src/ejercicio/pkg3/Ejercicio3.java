/*
 Crea una aplicación que a través de una función nos convierta una cantidad 
de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y la 
moneda a convertir que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double euro,dolar,yen,libras;
        String convertir;
        boolean salida=false;
        
        do {
        System.out.print("Ingrese la cantidad de euro a convertir: ");
        euro=sc.nextDouble();
        System.out.println("A que desea convertir (libra/dolar/yen): ");
        convertir=sc.next();
        
        conversion(euro,convertir);
        
        System.out.println("Desea hacer otra conversión? (S/N):");
        String pregunta=sc.next();
        if (pregunta.toUpperCase().equals("N")) {
            salida=true;
            System.out.println("Hasta luego.");
        }
        } while (salida!=true);
        
        
    }
     public static double conversion(double euro,String convertir){
         Scanner repregunta=new Scanner (System.in);
         switch (convertir) {
             case "libra":
                 double la=0.86*euro;
                 System.out.println("Su conversión a libra es: " + la);
                 return la;
             case "dolar":
                 double dr=1.28611*euro;
                 System.out.println("Su conversión a dolar es: " + dr);
                 return dr;
             case "yen":
                 double yn=129.852*euro;
                 System.out.println("Su conversión a yen es: " + yn);
                 return yn;
             default:
                 System.out.println("Opción incorrecta, vuelva a intentar (libra/dolar/yen):");
                 convertir=repregunta.next();
                 conversion(euro,convertir);
         }
         return 0;
    }
    
}

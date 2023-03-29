/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego 
un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.

 */
package extra.pkg5;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                       
        System.out.print("Ingrese el tipo de obra social que posee (A/B/C): ");
        char obra=sc.next().toUpperCase().charAt(0);
        String opcion = String.valueOf(obra);
        
      
        while (!opcion.equals("A") && !opcion.equals("B") && !opcion.equals("C")) {
            System.out.print("Dato mal ingresado, intente de nuevo: ");
            obra=sc.next().toUpperCase().charAt(0);
            opcion=String.valueOf(obra);
        }
                
        System.out.print("Ingrese el monto del tratamiento: ");
        double precio=sc.nextDouble();
                        
        switch (opcion) {
            case "A":
                System.out.println("El monto a pagar con descuento es: " + (precio-(precio*0.5)));
                break;
            case "B":
                System.out.println("El monto a pagar con descuento es: " + (precio-(precio*0.35)));
                break;
            case "C":
                System.out.println("Ud no posee descuentos, el monto a pagar es: " + precio);
                break;
                            
            }
    }
    
}

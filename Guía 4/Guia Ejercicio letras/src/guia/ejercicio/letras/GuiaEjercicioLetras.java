/*
 Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
 */
package guia.ejercicio.letras;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class GuiaEjercicioLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese una frase, debe terminar con punto.");
        String frase=in.next();
        
        System.out.println("salida: " + procesar(frase));        
    }
    public static String procesar(String frase){
        String salida="";
        String caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter=frase.substring(i, i+1);
            switch (caracter) {
                case "a","A": 
                caracter="@";
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        return null 
    
    }
}

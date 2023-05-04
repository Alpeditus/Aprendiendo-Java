/*
 Diseñe una función que pida el nombre y la edad de N personas e 
imprima los datos de las personas ingresadas por teclado e indique si 
son mayores o menores de edad. Después de cada persona, el programa 
debe preguntarle al usuario si quiere seguir mostrando personas y frenar 
cuando el usuario ingrese la palabra “No”.
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int edad;
        String persona,respuesta;
        boolean rta=false;
        
        do {
            System.out.println("Ingrese el nombre de la persona y la edad: ");
            System.out.print("Nombre: ");
            persona=sc.next();
            System.out.print("Edad: ");
            edad=sc.nextInt();
            clasificacion(edad);
            System.out.println("¿Desea ingresar otro usuario? (Si/No)");
            respuesta=sc.next().toLowerCase();
            if (respuesta.equals("no")) {
            rta=true;
            }                        
        } while (rta!=true);
    }
        public static int clasificacion(int edad){
            if (edad<18) {
                System.out.println("El usuario es menor de edad.");
            }else{
                System.out.println("El usuario es mayor de edad");
            }
            return 0;
        }
    }
    


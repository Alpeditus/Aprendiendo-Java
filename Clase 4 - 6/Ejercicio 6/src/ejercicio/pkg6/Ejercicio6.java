/*
 Realizar un programa que pida dos números enteros positivos por 
teclado y muestre por pantalla el siguiente menú:El usuario deberá 
elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta 
que se elija la opción 5. Tener en cuenta que, si el usuario selecciona 
la opción 5, en vez de salir del programa directamente, se debe mostrar 
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del 
programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        double num1, num2; 
        int opcion;
        boolean salir;
        salir = false;
      

        System.out.println("Ingrese el primer número");
        num1=sc.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2=sc.nextDouble();
        
        
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija una opción");
        
        
        do {
        
        
        opcion=sc.nextInt();
        
         switch (opcion){
            case 1: System.out.println("La suma de los números es " + (num1 + num2));
                    break;
            case 2: System.out.println("La resta de los números es " + (num1 - num2));
                    break;
            case 3: System.out.println("La multiplicación de los números es " + (num1 * num2));
                    break;
            case 4: System.out.println("La división de los números es " + (num1 / num2));
                    break;
            case 5: System.out.println("Seguro quiere salir?");
                    String salida = sc.next();
                    if (salida.toUpperCase().equals("S")){
                        salir = true;
                    } 
                    break;
            default: System.out.println("Elija una opción válida forro/a");
                    break;
         }
            if (salir!=true) {
                System.out.println("Elija una nueva opcion");
            }
            
        
        } while (salir != true);
        
    }
    
}

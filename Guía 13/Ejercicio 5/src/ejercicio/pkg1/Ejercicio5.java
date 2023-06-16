package ejercicio.pkg1;

import java.util.Scanner;

/**
 * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios,
 * a null y tratar de invocar el método esMayorDeEdad() a través de ese objeto.
 * Luego, englobe el código con una cláusula try-catch para probar la nueva
 * excepción que debe ser controlada.
 *
 * @author Cristian
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = (int)(Math.random()*501+1);
        System.out.println(numeroAdivinar);
        int intentos = 0;
        while (true) {
            System.out.println("Adivina el número entre 1 y 500");
            String numusuario = scanner.nextLine();
            intentos++;
            try {
                int numeroUsuario = Integer.parseInt(numusuario);
                if (numeroUsuario == numeroAdivinar) {
                    System.out.println("¡Adivinaste! El número era " + numeroAdivinar + ". Te tomó " + intentos + " intentos.");
                    break;
                } else if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número que buscas es mayor");
                } else {
                    System.out.println("El número que buscas es menor");
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número. Intenta de nuevo.");
            }
        }
    }
}
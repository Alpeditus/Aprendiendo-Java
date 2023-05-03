/*
Definir los siguientes métodos en AhorcadoService:

 */
package servicios;

import entidades.ahorcado;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ahorcadoService {

    Scanner leer = new Scanner(System.in);
    ahorcado c = new ahorcado();

    int cont = 0;

    public ahorcado crearJuegos() {
        /**
         * Metodo crearJuego(): le pide la palabra al usuario y cantidad de
         * jugadas máxima. Con la palabra del usuario, pone la longitud de la
         * palabra, como la longitud del vector. Después ingresa la palabra en
         * el vector, letra por letra, quedando cada letra de la palabra en un
         * índice del vector. Y también, guarda la cantidad de jugadas máximas y
         * el valor que ingresó el usuario.
         *
         */

        System.out.println("Ingrese una palabra: ");
        String palabra = leer.nextLine();
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        c.setJugadasMaximas(leer.nextInt());
        int longPalabra = palabra.length();
        String vector[] = new String[longPalabra];

        for (int i = 0; i < longPalabra; i++) {
            /**
             * esta línea de código convierte cada letra de la palabra en un
             * objeto String y lo agrega al vector vectorPalabra. Es necesario
             * convertir el carácter en un objeto String para poder almacenarlo
             * en un vector de strings.
             */
            vector[i] = String.valueOf(palabra.charAt(i));

        }
        c.setBuscar(vector);
        return c;
    }

    public void longitud() {

        /**
         * Método longitud(): muestra la longitud de la palabra que se debe
         * encontrar. Nota: buscar como se usa el vector.length.
         */
        System.out.println("La longitud de la palabra a buscar es: " + c.getBuscar().length);

    }

    public boolean buscar(String caracter) {
        /**
         * Método buscar(letra): este método recibe una letra dada por el
         * usuario y busca si la letra ingresada es parte de la palabra o no.
         * También informará si la letra estaba o no.
         */

        String vector[] = c.getBuscar();
        boolean acierto = false;
        int cont2 = 0;
        for (int i = 0; i < c.getBuscar().length; i++) {
            if (vector[i].equalsIgnoreCase(caracter)) {
                cont++;
                cont2++;
            }
        }
        
        if (cont2 > 0) {
            System.out.println("La letra se encuentra en la palabra");
            acierto = true;            
        } else {
            System.out.println("La letra NO se encuentra en la palabra");
        }
        
        return acierto;
    }

    public boolean encontradas(String caracter) {
        /**
         * Método encontradas(letra): que reciba una letra ingresada por el
         * usuario y muestre cuantas letras han sido encontradas y cuántas le
         * faltan. Este método además deberá devolver true si la letra estaba y
         * false si la letra no estaba, ya que, cada vez que se busque una letra
         * que no esté, se le restará uno a sus oportunidades.
         */
        
        boolean acierto = false;

        if (buscar(caracter)) {
        } else {
            c.setJugadasMaximas(c.getJugadasMaximas() - 1);
            if (c.getJugadasMaximas() == 0) {
                System.out.println("Ud a perdido.");
            }
        }

        System.out.println("Numeros de letras (encontradas/faltantes)" + cont + "/" + (c.getBuscar().length - cont));

        return acierto;
    }

    public void intentos() {
        /**
         * Método intentos(): para mostrar cuántas oportunidades le queda al
         * jugador
         */

        System.out.println("Le quedan " + c.getJugadasMaximas() + " intentos.");
    }

    public void juego() {
        /**
         * Método juego(): el método juego se encargará de llamar todos los
         * métodos previamente mencionados e informará cuando el usuario
         * descubra toda la palabra o se quede sin intentos. Este método se
         * llamará en el main.
         */

        int intentos = c.getJugadasMaximas();
        String letra;
        crearJuegos();
        longitud();

        do {
            if (cont != c.getBuscar().length) {
                System.out.println("Ingrese una letra: ");
                letra = leer.next();
                encontradas(letra);
                intentos();
            } else {
                System.out.println("Adivinó la palabra.");
                break;
            }

        } while (c.getJugadasMaximas() != 0);

    }
}

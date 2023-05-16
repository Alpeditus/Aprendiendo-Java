/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class perros {

    private Scanner leer;
    private ArrayList<String> razaPerro;
    private String raza, pregunta;

    public perros() {
        this.leer = new Scanner(System.in);
        this.razaPerro = new ArrayList();
    }

    public void llenarLista() {
        raza = leer.next();
        razaPerro.add(raza);
    }

    public void consultarMas() {
        do {
            System.out.println("Ingrese raza: ");
            llenarLista();
            System.out.println("Desea agregar otra raza(S/N): ");
            pregunta = leer.next();
            while (!pregunta.equalsIgnoreCase("s") & !pregunta.equalsIgnoreCase("n")) {
                System.out.println("Ingrese correctamente la respuesta: ");
                pregunta = leer.next();
            }
        } while (pregunta.equalsIgnoreCase("s"));
    }

    public void imprimirLista() {
        consultarMas();

        System.out.println("La lista de raza de perros es: ");

        for (String aux : razaPerro) {
            System.out.println(aux);
        }
    }

    /**
     * Continuando el ejercicio anterior, después de mostrar los perros, al
     * usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se
     * buscará el perro en la lista. Si el perro está en la lista, se eliminará
     * el perro que ingresó el usuario y se mostrará la lista ordenada. Si el
     * perro no se encuentra en la lista, se le informará al usuario y se
     * mostrará la lista ordenada.
     */
    public void eliminarOrdenar() {
        Iterator<String> it = razaPerro.iterator();
        boolean sc = false;
        System.out.println("Ingrese una raza a elmininar de la lista: ");
        raza = leer.next();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(raza)) {
                it.remove();
                sc = true;
            }
        }
        if (sc) {
            System.out.println("La lista actualizada es");            
        }else{
            System.out.println("La raza ingresada no se encuentra en la lista.");
        }
        Collections.sort(razaPerro);        
        for (String aux : razaPerro) {
            System.out.println(aux);
        }
    }
}

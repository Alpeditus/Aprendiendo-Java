/**
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
 * usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
 * conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
 * si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
 * los servicios en la clase correspondiente)
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
 * cómo se ordena un conjunto.
 * Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
 * buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
 * usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
 * al usuario.
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class PaisAPP {

    private Scanner leer;
    private HashSet<String> pais;
    private String dato;
    private boolean respuesta;

    public PaisAPP() {
        this.leer = new Scanner(System.in);
        this.pais = new HashSet();
    }

    public void ingresarPais() {
        Pais paises = new Pais();
        System.out.println("Ingrese un país: ");
        dato = leer.nextLine();
        pais.add(dato);
    }

    public void bucleIngreso() {
        System.out.println("----- Se le pedirá ingresar una lista de paises -----");
        do {
            ingresarPais();
            System.out.println("Desea agregar otro: ");
            dato = leer.nextLine();
            while (!dato.equalsIgnoreCase("s") & !dato.equalsIgnoreCase("n")) {
                System.out.println("Mal ingresado, responda con S o N: ");
                dato = leer.nextLine();
            }
        } while (dato.equalsIgnoreCase("s"));

    }

    public void mostrarPaises() {
        System.out.println("La lista de paises es: ");
        for (String pai : pais) {
            System.out.println(pai);
        }
    }

    public void ordenarAlfab() {
        ArrayList<String> listaPaises = new ArrayList(pais);
        Collections.sort(listaPaises);
        System.out.println("Paises ordenados alfabeticamente: ");
        listaPaises.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }

    public void eliminarPais() {
        System.out.println("Que país desea eliminar: ");
        dato = leer.nextLine();
        Iterator it = pais.iterator();
        while (it.hasNext()) {
            if (it.next().equals(dato)) {
                it.remove();
                respuesta = true;
            }            
        }
        if (respuesta) {
            System.out.println("Lista actualizada, se ha eliminado el país elegido.");
            System.out.println("");
            mostrarPaises();
        }else{
            System.out.println("El país seleccionado no se encuentra en la lista.");
        }
    }
}

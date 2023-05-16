/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejercicio.pkg1;

import Servicios.perros;

/**
 *
 * @author Cristian
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        perros sc = new perros();

        System.out.println("------- Bienvenidos, agregue raza de perros a la lista -------");
        sc.imprimirLista();
        System.out.println("------- Eliminar y ordenar -------");
        sc.eliminarOrdenar();
    }
}

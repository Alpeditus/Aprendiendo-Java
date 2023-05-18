/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio.pkg6;

import java.util.Scanner;
import servicios.TiendaAPP;

/**
 *
 * @author Cristian
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TiendaAPP sc = new TiendaAPP();

        boolean opcion = false;        
        do {
            System.out.println("--- Bienvenidos ---");
            System.out.println("Elija del menú que desea hacer: ");
            System.out.println("1. Ingresar productos.");
            System.out.println("2. Modificar precio de un producto.");
            System.out.println("3. Eliminar un producto.");
            System.out.println("4. Mostrar.");
            System.out.println("5. Salir.");
            int dato = leer.nextInt();
            switch (dato) {
                case 1:
                    sc.agregarLista();
                    break;
                case 2:
                sc.cambiarPrecio();
                    break;
                case 3:
                sc.eliminarProducto();
                    break;
                case 4:
                    sc.mostrarLista();
                    break;
                case 5:
                    System.out.println("Hasta luego.");
                    opcion = true;
                    break;
            }
            System.out.println("");
        } while (!opcion);
    }
}

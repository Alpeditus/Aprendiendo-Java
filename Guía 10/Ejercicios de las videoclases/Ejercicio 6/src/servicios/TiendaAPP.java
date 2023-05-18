package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class TiendaAPP {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String nombre, pregunta;
    public int precio;
    HashMap<String, Integer> productos = new HashMap();

    public void cargarProductos() {
        System.out.print("Producto: ");
        nombre = leer.next();
        System.out.print("Precio: ");
        precio = leer.nextInt();
        productos.put(nombre, precio);
    }

    public void agregarLista() {
        System.out.println("Introduzca un producto y su precio: ");
        do {
            cargarProductos();
            System.out.println("Desea agregar otro producto (S/N): ");
            pregunta = leer.next();
            while (!pregunta.equalsIgnoreCase("s") & !pregunta.equalsIgnoreCase("n")) {
                System.out.println("Mal ingresado, responda con S o N: ");
                pregunta = leer.nextLine();
            }
        } while (pregunta.equalsIgnoreCase("s"));
    }

    public void mostrarLista() {
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " - " + "Precio: $" + entry.getValue() + ".");
        }
    }

    public void eliminarProducto() {
        System.out.println("Que producto desea eliminar: ");
        nombre = leer.next();
        productos.remove(nombre);
        System.out.println("El producto " + nombre + " fue eliminado de la lista.");
        System.out.println("Desea ver la lista actualizada: ");
        pregunta = leer.next();
        while (!pregunta.equalsIgnoreCase("s") & !pregunta.equalsIgnoreCase("n")) {
            System.out.println("Mal ingresado, responda con S o N: ");
            pregunta = leer.nextLine();
        }
        if (pregunta.equalsIgnoreCase("s")) {
            mostrarLista();
        }
    }

    public void cambiarPrecio() {
        System.out.println("Ingrese el producto que desea modificar el precio: ");
        nombre = leer.next();
        
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio: ");
            precio = leer.nextInt();
            productos.replace(nombre, precio); //Reemplazar valor.
            System.out.println("Desea ver la lista actualizada: ");
            pregunta = leer.next();
            while (!pregunta.equalsIgnoreCase("s") & !pregunta.equalsIgnoreCase("n")) {
                System.out.println("Mal ingresado, responda con S o N: ");
                pregunta = leer.nextLine();
            }
            if (pregunta.equalsIgnoreCase("s")) {
                mostrarLista();
            }
        }else{
            System.out.println("El producto " + nombre + " no se encuentra en la lista.");
        }
    }
}

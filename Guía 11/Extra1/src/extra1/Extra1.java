package extra1;

import java.util.Scanner;
import servicios.Adopcion;

/**
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro
 * programa va a tener que contar con muchas personas y muchos perros. El
 * programa deberá preguntarle a cada persona, que perro según su nombre, quiere
 * adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió
 * un perro que ya estaba adoptado, se le debe informar a la persona. Una vez
 * que la Persona elige el Perro se le asigna, al final deberemos mostrar todas
 * las personas con sus respectivos perros.
 *
 * @author Cristian
 */
public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Adopcion adop = new Adopcion();

        System.out.print("Cuantos perros ingresarán a la perrería: ");
        int num = leer.nextInt();
        System.out.println("");
        for (int i = 0; i < num; i++) {
            adop.crearPerro();
        }

        System.out.print("Cuantas personas desean adoptar perros: ");
        int num2 = leer.nextInt();
        System.out.println("");
        for (int i = 0; i < num2; i++) {
            adop.crearPersona();
        }
        
        System.out.println("Listado de personas con sus perros adoptados:");
        adop.mostrarPersonas();
        
        System.out.println("Perros sin adoptar: ");
        adop.mostrarPerros();
    }
}

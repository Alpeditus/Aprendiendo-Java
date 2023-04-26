/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y 
esMayorDeEdad en distintas variables(arrays), para después calcular un 
porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en 
su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de 
cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos 
métodos adicionales.

 */
package ejericio.pkg3;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejericio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio sc = new PersonaServicio();
        Persona p1 = sc.crearPersona();
        Persona p2 = sc.crearPersona();
        Persona p3 = sc.crearPersona();
        Persona p4 = sc.crearPersona();

        Persona[] vector = new Persona[4];
        vector[0] = p1;
        vector[1] = p2;
        vector[2] = p3;
        vector[3] = p4;

        for (int i = 0; i < 3; i++) {

            Persona p = vector[i];

            if (sc.esMayorDeEdad(p)) {
                System.out.println(p.getNombre() + "La persona es mayor de edad.");
            } else {
                System.out.println(p.getNombre() + "La persona es menor de edad.");
            }

            switch ((int) sc.calcularIMC(p)) {
                case -1:
                    System.out.println(p.getNombre() + " está por debajo de su peso ideal.");
                    break;
                case 0:
                    System.out.println(p.getNombre() + " está en su peso ideal.");
                    break;
                case 1:
                    System.out.println(p.getNombre() + " está por encima de su peso ideal.");
                    break;
            }
        }

    }

}

package ejercicio.pkg1;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 *
 * @author Cristian
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Perro perro1 = new Perro("Damita", "Dalmata", 6, 123456, "Mediana");
        Perro perro2 = new Perro("Juan", "Callejero", 3, 321654, "Chico");
        
        List<Perro> perros = new ArrayList();
        
        perros.add(perro1);
        perros.add(perro2);
        
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        
        persona.setNombre("Facundo");
        persona.setApellido("Castillo");
        persona.setEdad(10);
        persona.setDocumento(52506572);
        persona.setPerro(perro1);
        
        persona2.setNombre("Lorenzo");
        persona2.setApellido("Castillo");
        persona2.setEdad(6);
        persona2.setDocumento(55639113);
        persona2.setPerro(perro2);
        
        System.out.println(persona.toString());
        System.out.println("");
        System.out.println(persona2.toString());
        
        
        
//        System.out.println("Cuantos perros desea agregar: ");
//        int num = 2; // A pedido de la consigna sino "leer.nextInt()"
        
    }

}

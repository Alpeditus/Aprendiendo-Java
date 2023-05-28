package extra1;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Extra1 {

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
    }
    
}


package javaapplication85;

import entidades.Persona;
import entidades.dni;

/**
 *
 * @author Cristian
 */
public class JavaApplication85 {
    
    public static void main(String[] args) {
    dni doc = new dni();
    doc.setSerie("A");
    doc.setNumero(32467632);
    Persona persona = new Persona();
    persona.setNombre("Juan");
    persona.setApellido("Perez");
    persona.setDocumento(doc);
        System.out.println(persona);
    }    
}

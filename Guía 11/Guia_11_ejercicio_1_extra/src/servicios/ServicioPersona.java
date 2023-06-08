/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import enumeradores.ApellidosPersonas;
import enumeradores.NombresPersonas;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author fernando
 */
public class ServicioPersona {
    
    private Random random = new Random();
    
    
    /*
    Crear una persona
    */
    
    public Persona crearPersona(){
        // auxiliares       random.nextInt(7)
        Persona persona = new Persona();
        
        // definir atributos
        persona.setNombre(NombresPersonas.values()[random.nextInt(
                NombresPersonas.values().length)].toString());
        persona.setApellido(ApellidosPersonas.values()[random.nextInt(
                ApellidosPersonas.values().length)].toString());
        persona.setEdad(random.nextInt(50)+20);
        persona.setDni(random.nextInt(100000000));
        persona.setPerro(new Perro());
        
        
        return persona;
    }
    
    /*
    Fábrica de personas
    */
    
    public ArrayList<Persona> crearMultitud(int cantidad){
        ArrayList<Persona> multitud = new ArrayList();
        
        for (int i = 0; i < cantidad; i++) {
            multitud.add(crearPersona());
        }
        
        return multitud;
    }
}

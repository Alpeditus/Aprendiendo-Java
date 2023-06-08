/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_11_ejercicio_1;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Random;
import servicios.ServicioPerro;
import servicios.ServicioPersona;

/**
 *
 * @author fernando
 */
public class Guia_11_ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 1
        
        // dos personas
        Persona juancho = new Persona();
        Persona quique = new Persona();
        
        // dos perros
        Perro uno = new Perro();
        Perro cunia = new Perro();
        
        // Definir Juancho
        juancho.setNombre("Juan");
        juancho.setApellido("De la Vera Cruz");
        juancho.setEdad(50);
        juancho.setDni(234989234);
        juancho.setPerro(uno);
        
        // Definir Quique
        quique.setNombre("Enrique Hernán");
        quique.setApellido("Cardoso");
        quique.setEdad(30);
        quique.setDni(92348793);
        quique.setPerro(cunia);
         */

 /*
        Auxiliares
         */
        Random random = new Random();
        ServicioPerro madreNaturaleza1 = new ServicioPerro();
        ServicioPersona madreNaturaleza2 = new ServicioPersona();
        ArrayList<Perro> jauria = new ArrayList();
        ArrayList<Persona> multitud = new ArrayList();

        /*
        Fábrica de individuos
         */
        jauria = madreNaturaleza1.crearJauria(5);
        multitud = madreNaturaleza2.crearMultitud(7);

//        for (Object object : multitud) {
//            System.out.println(object);
//        }
//        
//        for (Object object : jauria) {
//            System.out.println(object);
//        }

        /*
        Sistema de adopción
         */
        for (Persona persona : multitud) {
            System.out.println("");
            System.out.println(persona.getNombre()+" "+persona.getApellido()+".");
            System.out.println("¿Qué perro quiere adoptar?");
            
            Perro quieroAdoptar = jauria.get(random.nextInt(jauria.size()));
            System.out.println("Voy a querer a "+ quieroAdoptar+".");
            
            boolean adoptado = false;
            for (Persona persona1 : multitud) {
                if (persona1.getPerro().equals(quieroAdoptar)) {
                    System.out.println("Ya tiene dueño.");
                    adoptado = true;
                }
            }
            if (!adoptado) {
                    persona.setPerro(quieroAdoptar);
                }
        }
        
        /*
        Mostrar por pantalla
        */
        System.out.println("");
        System.out.println("");
        for (Persona persona : multitud) {
            System.out.println(persona);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class Adopcion {

    public Scanner leer = new Scanner(System.in);
    private List<Perro> perros = new ArrayList();
    private List<Perro> adoptados = new ArrayList();
    private List<Persona> personas = new ArrayList();

    public void crearPerro() {
        System.out.println("Ingrese los datos del perro: ");
        System.out.print("Nombre: ");
        String name = leer.next();
        System.out.print("Raza: ");
        String breed = leer.next();
        System.out.print("Edad: ");
        int age = leer.nextInt();
        System.out.print("Documento: ");
        long doc = leer.nextLong();
        System.out.print("Tamaño: ");
        String size = leer.next();
        Perro perro = new Perro(name, breed, age, doc, size);
        perros.add(perro);
        System.out.println("");
    }

    public void crearPersona() { //Crea el objeto perro.
        System.out.println("Ingrese los datos de las personas: ");
        System.out.print("Nombre: ");
        String name = leer.next();
        System.out.print("Apellido: ");
        String lastName = leer.next();
        System.out.print("Edad: ");
        int age = leer.nextInt();
        System.out.print("Documento: ");
        long doc = leer.nextLong();
        Persona persona = new Persona(name, lastName, age, doc, adoptarPerro(name));
        personas.add(persona);
        System.out.println("");
    }

    public void mostrarPerros() {
        System.out.println("Cantidad: " + perros.size() + ".");
        System.out.println("Listado: ");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }

    public void mostrarPersonas() {
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
        System.out.println("");
    }

    public Perro adoptarPerro(String name) {
        String eleccion = "";
        Perro perroSeleccionado = null;
        System.out.println("Cantidad de perros a adoptar: " + perros.size() + ".");
        System.out.println("Que perro desea adoptar: ");
        do {
            for (Perro perro : perros) {
                System.out.println(perro);
            }
            eleccion = leer.next();
            for (Perro aux : perros) {
                if (eleccion.equalsIgnoreCase(aux.getNombre())) {
                    perroSeleccionado = aux;
                    break;
                }
            }
            if (perroSeleccionado != null) {
                adoptados.add(perroSeleccionado);
                perros.remove(perroSeleccionado);
                System.out.println(name + " adopto a " + perroSeleccionado + ".");
            } else {
                System.out.println("El nombre del perro no está en la lista, vuelva a intentar.");
            }

        } while (perroSeleccionado == null);
        return perroSeleccionado;
    }
}

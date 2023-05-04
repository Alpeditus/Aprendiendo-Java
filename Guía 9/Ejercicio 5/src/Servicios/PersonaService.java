/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un 
nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor 
parametrizado, get y set. Crear una clase PersonaService, en el paquete 
servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de 
fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si 
la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
*/
package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class PersonaService {
    
    Persona sPersona = new Persona();
    Scanner sc = new Scanner(System.in);
    
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese nombre: ");
        sPersona.setNombre(sc.nextLine());
        System.out.println("Ingrese día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        int mes = sc.nextInt()-1;
        System.out.println("Ingrese año de nacimiento: ");
        int anio = sc.nextInt()-1900;
        
        Date fechaNacimiento = new Date(dia,mes,anio);
        sPersona.setFechaNacimiento(fechaNacimiento);
        
        return sPersona;        
    }
    
    public int calcularEdad(){
        
        Date fechaActual = new Date();
        LocalDate fechaActual2 = LocalDate.now();
        
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L; //Milisegundos en un año.
        long diferenciaEnMilisegundos = fechaActual.getTime() - sPersona.getFechaNacimiento().getTime();
        int diferenciaEnAnos = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);
        
        return diferenciaEnAnos;
    }
}

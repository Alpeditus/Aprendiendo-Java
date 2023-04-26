//En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona p = new Persona();

    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
    devuelve un booleano.
     */
    public boolean esMayorDeEdad(Persona edad) {

        return (edad.getEdad() >= 18);
    }

    /*Metodo crearPersona(): el método crear persona, le pide los valores de los 
    atributos al usuario y después se le asignan a sus respectivos atributos para 
    llenar el objeto Persona. Además, comprueba que el sexo introducido sea 
    correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
     */
    public Persona crearPersona() {

        System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Ingrese edad: ");
        int edad = leer.nextInt();

        System.out.println("Ingrese sexo H/M/O: ");
        String sexo = leer.next().toUpperCase();

        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {

            System.out.println("Mal ingresado, vuelva a intentar: ");
            sexo = leer.next();

        }

        System.out.println("Ingrese peso (kg): ");
        double peso = leer.nextDouble();

        System.out.println("Ingrese altura (mts): ");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
    significa que la persona está por debajo de su peso ideal y la función devuelve 
    un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
    significa que la persona está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa 
    que la persona tiene sobrepeso, y la función devuelve un 1.
     */
    public double calcularIMC(Persona calc){
        
        double peso = calc.getPeso();
        double altura = calc.getAltura();
        int imc=0;
        
        if (peso/Math.pow(altura, 2)<20) {
            imc = -1;
        }
        
        if (peso/Math.pow(altura, 2)>=20 && peso/Math.pow(altura, 2)<=25) {
            imc = 0;
        }
        
        if (peso/Math.pow(altura, 2)>25) {
            imc = 1;
        }
        
        return imc;
    }
}

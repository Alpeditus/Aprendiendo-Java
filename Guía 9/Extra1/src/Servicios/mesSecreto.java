/*
Crea una clase en Java donde declares una variable de tipo array de Strings que 
contenga los doce meses del año, en minúsculas. A continuación, declara una 
variable mesSecreto de tipo String, y hazla igual a un elemento del array (por 
ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el 
mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir 
que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del 
programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class mesSecreto {

    Scanner leer = new Scanner(System.in);
    String[] vector = new String[12];

    public void cargarMeses() {

        this.vector[0] = "enero";
        this.vector[1] = "febrero";
        this.vector[2] = "marzo";
        this.vector[3] = "abril";
        this.vector[4] = "mayo";
        this.vector[5] = "junio";
        this.vector[6] = "julio";
        this.vector[7] = "agosto";
        this.vector[8] = "septiembre";
        this.vector[9] = "octubre";
        this.vector[10] = "noviembre";
        this.vector[11] = "diciembre";

    }

    public void adivinaMes() {
        Random rand = new Random();
        String mesSecreto = vector[rand.nextInt(12)];
        System.out.println("mesSecreto = " + mesSecreto);
        String mes;
        
        do {
            System.out.println("Ingrese el mes secreto: ");
            mes = leer.next();
            if (mes.equalsIgnoreCase(mesSecreto)) {
                System.out.println("¡Has acertado!");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        } while (!mes.equalsIgnoreCase(mesSecreto));

    }
}

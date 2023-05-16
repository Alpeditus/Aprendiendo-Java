package ejercicio.pkg3;

import alumnoService.servicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        servicioAlumno sc = new servicioAlumno();
        
        sc.consultarAgregar();
        sc.notaFinal();
    }

}

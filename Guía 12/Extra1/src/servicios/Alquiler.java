package servicios;

import entidades.BarcoMotor;
import entidades.Velero;
import entidades.YateLujo;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 *
 * @author Cristian
 */
public class Alquiler {

    Scanner leer = new Scanner(System.in);
    
    
    public void alquilarBarco() {
        System.out.println("Ingrese fecha de alquiler (dd/mm/aaaa): ");
        String salida = leer.nextLine();
        System.out.println("Ingrese fecha de entrega (dd/mm/aaaa): ");
        String entrada = leer.nextLine();
        
        // Definir el formato de fecha de entrada
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

        // Parsear las fechas ingresadas como objetos LocalDate
        LocalDate inicio = LocalDate.parse(salida, formatoFecha);
        LocalDate finaal = LocalDate.parse(entrada, formatoFecha);

        // Calcular la diferencia en días
        long diasDiferencia = ChronoUnit.DAYS.between(inicio, finaal);

        System.out.println("Que barco desea alquilar: ");
        System.out.println("1. Velero.");
        System.out.println("2. Barco de Motor.");
        System.out.println("3. Yate de lujo.");
        int eleccion = leer.nextInt();

        int modulo;
        int precioFinal=0;
        switch (eleccion) {
            case 1:
                Velero velero = new Velero();
                modulo = velero.modulo();
                precioFinal = modulo * (int)diasDiferencia;
                System.out.println((int)diasDiferencia);
                System.out.println(modulo);
                velero.toString();
                
                break;
                case 2:
                BarcoMotor barco = new BarcoMotor();
                modulo = barco.modulo();
                precioFinal = modulo * (int)diasDiferencia;
                barco.toString();
                break;
                case 3:
                YateLujo yate = new YateLujo();
                modulo = yate.modulo();
                precioFinal = modulo * (int)diasDiferencia;
                yate.toString();
                break;                
        }
        System.out.println("Valor a pagar: $" + precioFinal + ".");
        
    }
}

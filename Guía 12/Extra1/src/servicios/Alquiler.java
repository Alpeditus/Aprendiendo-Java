package servicios;

import entidades.BarcoMotor;
import entidades.Velero;
import entidades.YateLujo;
import java.time.LocalDate;
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

        //Menu para la eleccion de tipos de barco.
        System.out.println("Que barco desea alquilar: ");
        System.out.println("1. Velero.");
        System.out.println("2. Barco de Motor.");
        System.out.println("3. Yate de lujo.");
        int eleccion = leer.nextInt();

        int modulo;
        int precioFinal = 0;
        switch (eleccion) {
            case 1:
                //Creacion del objeto velero.
                Velero velero = new Velero(4, 10, 1020, LocalDate.of(1999, 6, 5));
                modulo = velero.moduloVelero();
                precioFinal = modulo * (int) diasDiferencia;
                System.out.println((int) diasDiferencia);//Para saber la cantidad de dias calculado, se puede borrar.
                System.out.println(modulo);//Para saber el valor del modulo, se puede borrar.
                System.out.println(velero.toString());
                break;
            case 2:
                BarcoMotor barco = new BarcoMotor(500, 20, 1670, LocalDate.of(2001, 3, 28));
                modulo = barco.moduloBarcoMotor();
                precioFinal = modulo * (int) diasDiferencia;
                System.out.println(barco.toString());
                System.out.println((int) diasDiferencia);//Para saber la cantidad de dias calculado, se puede borrar.
                System.out.println(modulo);//Para saber el valor del modulo, se puede borrar.
                break;
            case 3:
                YateLujo yate = new YateLujo(4, 500, 15, 6540, LocalDate.of(2010, 9, 2));
                modulo = yate.moduloYate();
                precioFinal = modulo * (int) diasDiferencia;
                System.out.println(yate.toString());
                System.out.println((int) diasDiferencia);//Para saber la cantidad de dias calculado, se puede borrar.
                System.out.println(modulo);//Para saber el valor del modulo, se puede borrar.
                break;
        }
        System.out.println("Valor a pagar: $" + precioFinal + ".");

    }
}

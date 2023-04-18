/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se 
retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar 
que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package ejercicio.pkg1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        CuentaBancariaServicio principal = new CuentaBancariaServicio();
        CuentaBancaria c1 = principal.crearCuenta();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Ingresar dinero.");
        System.out.println("2. Retirar dinero.");
        System.out.println("3. Extracción rápida.");
        System.out.println("4. Consultar saldo.");
        System.out.println("5. Consultar datos.");
        System.out.println("6. Salir.");

        int opcion;
        do {
            System.out.println("Que opción desea elegir: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    principal.ingresarDinero(c1);
                    break;
                case 2:
                    principal.retirarDinero(c1);
                    break;
                case 3:
                    principal.extraccionRapida(c1);
                    break;
                case 4:
                    principal.consultarSaldo(c1);
                    break;
                case 5:
                    principal.consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Hasta luego.");
                    break;

            }
        } while (opcion != 6);

    }

}

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
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class CuentaBancariaServicio {
    
    CuentaBancaria cb = new CuentaBancaria();
    Scanner sc = new Scanner (System.in);
    
    public CuentaBancaria crearCuenta(){
        
        System.out.println("Ingrese el número de cuenta: ");
        int cuenta = sc.nextInt();
        System.out.println("Ingrese DNI: ");
        long dni = sc.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        double saldo = sc.nextDouble();
        
        return new CuentaBancaria(cuenta,dni,saldo);
    }
    
    public void ingresarDinero(CuentaBancaria dinero){
        
        System.out.println("Cuanto dinero desea ingresar? ");
        double ingresar = sc.nextDouble();
        dinero.setSaldoActual(dinero.getSaldoActual()+ingresar);
                
    }
    
    public void retirarDinero(CuentaBancaria dinero){
        
        System.out.println("Cuanto dinero desera retirar? ");
        double retiro = sc.nextDouble();
        
        if (dinero.getSaldoActual()>retiro){
            dinero.setSaldoActual(dinero.getSaldoActual()-retiro);
        }else{
            System.out.println("Saldo insuficiente, se retirará: " + dinero.getSaldoActual());
            dinero.setSaldoActual(0);
        }
        
    }
    
    public void extraccionRapida(CuentaBancaria dinero){
                            
        dinero.setSaldoActual(dinero.getSaldoActual()-(dinero.getSaldoActual()*0.2));
        
    }
    
    public void consultarSaldo(CuentaBancaria saldo){
        
        System.out.println("Su saldo actual es de $" + saldo.getSaldoActual());
        
    }
    
    public void consultarDatos(CuentaBancaria dato){
        
        System.out.println("Los datos de su cuenta son: ");
        System.out.println("Número de cuenta: " + dato.getNumeroCuenta() + ".");
        System.out.println("DNI: " + dato.getDniCliente() + ".");
        
    }
}

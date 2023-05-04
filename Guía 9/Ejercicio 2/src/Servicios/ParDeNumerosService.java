/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además 
implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ParDeNumerosService {

    ParDeNumeros num = new ParDeNumeros();
    Scanner sc = new Scanner(System.in);

    public void mostrarValores() {
        System.out.println("El primer número es: " + num.getNum1());
        System.out.println("El segundo número es: " + num.getNum2());
    }

    public double devolverMayor() {
        double mayor = 0;
        double menor = 0;

        if (num.getNum1() > num.getNum2()) {
            mayor = num.getNum1();
            System.out.println("El primer número es mayor.");
        } else if (num.getNum1() < num.getNum2()) {
            mayor = num.getNum2();
            System.out.println("El segundo número es mayor.");
        } else {
            mayor = num.getNum1();
            System.out.println("Los números son iguales.");
        }
        return mayor;
    }

    public void calcularPotencia() {
        double potencia;
        if (num.getNum1()>num.getNum2()) {
            potencia = Math.pow(num.getNum1(), num.getNum2());
        }else{
            potencia = Math.pow(num.getNum2(), num.getNum1());
        }
        
        System.out.println("Potencia = " + Math.round(potencia));
    }
    
    public void calculaRaiz(){
        double n = 0;
        double raiz;
        
        if (num.getNum1()>num.getNum2()) {
            n = num.getNum2();
        }else{
            n = num.getNum1();
        }
        n = Math.abs(n);
        raiz = Math.sqrt(n);
        
        System.out.println("Raiz = " + Math.round(raiz));
    }
}

/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener 
la cafetera) y cantidadActual (la cantidad actual de café que hay en la 
cafetera). Agregar constructor vacío y con parámetros así como setters y 
getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad 
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se 
sirve lo que quede. El método le informará al usuario si se llenó o no la taza, 
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicio.pkg2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        CafeteraServicio x = new CafeteraServicio();
        Cafetera c = new Cafetera();
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU CAFETERA");
        System.out.println("");
        System.out.println("1.CONSULTAR CANTIDAD DE CAFÉ.");
        System.out.println("2.SERVIR CAFÉ.");
        System.out.println("3.AGREGAR CAFÉ.");
        System.out.println("4.LLENAR CAFETERA.");
        System.out.println("5.VACIAR CAFETERA.");
        System.out.println("6.APAGAR.");

        int opcion;
        do {
            System.out.println("Que opción desea: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    x.consultarCafe(c);
                    break;
                case 2:
                    x.servirTaza(c);
                    break;
                case 3:
                    x.agregarCafe(c);
                    break;
                case 4:
                    x.llenarCafetera(c);
                    break;
                case 5:
                    x.vaciarCafetera(c);
                    break;
                case 6:
                    System.out.println("APAGANDO...");
                    ;
                    break;
            }

        } while (opcion != 6);

    }

}

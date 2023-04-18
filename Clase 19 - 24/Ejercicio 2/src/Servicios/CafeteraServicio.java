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
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class CafeteraServicio {
    
    Scanner sc = new Scanner(System.in);
    Cafetera cf = new Cafetera();
    
    public void llenarCafetera(Cafetera c){
        
        c.setCapacidadMáxima(100);
        c.setCantidadActual(c.getCapacidadMáxima());
        System.out.println("Se llenó al máximo su cafetera.");
        
    }
    
    public void servirTaza(Cafetera c){
        
        System.out.println("De que tamaño desea la taza, eliga de 1 a 5: ");
        int taza = sc.nextInt();
        
        if (taza<c.getCantidadActual()) {
            
            System.out.println("Que disfrute su pedido.");
            c.setCantidadActual(c.getCantidadActual()-taza);
            
        }else{
            if (c.getCantidadActual()==0) {
                
                System.out.println("No hay más café.");
                
            }else {
                
            System.out.println("Se llenó su taza hasta " + c.getCantidadActual() + ".");
            c.setCantidadActual(0);
            
            }
        }
    }
    
    public void vaciarCafetera(Cafetera c){
        
        c.setCantidadActual(0);
        System.out.println("Se vació su cafetera.");
        
    }
    
    public void agregarCafe(Cafetera c){
        
        System.out.println("Cuanto café desea agregar: ");
        int agregar = sc.nextInt();
        c.setCantidadActual(c.getCantidadActual()+agregar);
        System.out.println("Café agregado.");
        
    }
    
    public void consultarCafe (Cafetera c){
        
        System.out.println("El saldo de café en la cafetera es de " + c.getCantidadActual() + ".");
        
    }
}

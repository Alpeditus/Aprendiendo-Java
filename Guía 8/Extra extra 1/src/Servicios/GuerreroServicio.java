/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Guerrero;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class GuerreroServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Guerrero sc = new Guerrero();
    
    public void crearGuerrero(){
        
        System.out.println("Ingrese nombre del guerrero: ");
        sc.setNombre(leer.next());
        System.out.println("Ingrese clase guerrera R(romano)/B(barbaro): ");
        sc.setClase(leer.next());
        
        while (!sc.getClase().toUpperCase().equals("R")||!sc.getClase().toUpperCase().equals("B")) {
            System.out.println("Clase de guerrero errorea: ");
            sc.setClase(leer.next());
        }
        
        if (sc.getClase().toUpperCase().equals("R")) {
            sc.setExperiencia(0);
            sc.setVidaBase(115);
            sc.setFuerzaBase(20);
            sc.setDefensaBase(25);
            sc.setAgilidadBase(20);
            sc.setCriticosBase(0);
            sc.setOro(500);
                        
        }else{
            sc.setExperiencia(0);
            sc.setVidaBase(100);
            sc.setFuerzaBase(25);
            sc.setDefensaBase(20);
            sc.setAgilidadBase(25);
            sc.setCriticosBase(0);
            sc.setOro(500);
        }        
    }
    
    public void combatir(){
        
        
    }
}

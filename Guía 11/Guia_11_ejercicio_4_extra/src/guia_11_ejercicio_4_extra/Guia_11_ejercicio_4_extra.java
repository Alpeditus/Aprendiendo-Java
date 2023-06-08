/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_11_ejercicio_4_extra;

import java.util.ArrayList;
import servicios.Simulador;

/**
 *
 * @author fernando
 */
public class Guia_11_ejercicio_4_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Simulador sim = new Simulador();
        
        ArrayList<String> nombres = sim.crearNombres();
        ArrayList<String> apellidos = sim.crearApellidos();
        ArrayList<Integer> dnis = sim.crearDnis(nombres.size());
        
        System.out.println(sim.crearAlumnos(nombres, apellidos, dnis));
    }
    
}

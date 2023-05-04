/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.guia9;

import Entidades.Cadena;
import Servicios.CadenaServicios;

/**
 *
 * @author dgalm
 */
public class Ej1Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicios sv=new CadenaServicios();
        
        Cadena c1=new Cadena("astronauta");
        Cadena c2=new Cadena("murcielago");
//        sv.mostrarVocales(c1);
//        sv.mostrarVocales(c2);
//        
//        sv.invertirFrase(c2);
//        sv.invertirFrase(c1);
//        
//        
//        sv.vecesRepetido(c1, "t");
        
//        sv.compararLongitud(c2, "pepito");
//        sv.compararLongitud(c2, "murcielago");
//        sv.compararLongitud(c2, "esternocleidomastoideo");
         // sv.unirFrases(c2, "Volador");
         // sv.reemplazar(c2, "*");
          
         System.out.println(sv.contiene(c2, "x"));
        
        }
    
}

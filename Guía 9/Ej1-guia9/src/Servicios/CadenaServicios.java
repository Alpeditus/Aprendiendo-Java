/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;

/**
 *
 * @author dgalm
 */
public class CadenaServicios {
    
     public void mostrarVocales(Cadena C){
         int contadorVocales = 0;
         for (int i = 0; i < C.getLongitud(); i++) {
            if(C.getFrase().substring(i, i+1).equalsIgnoreCase("a") || C.getFrase().substring(i, i+1).equalsIgnoreCase("u")|| C.getFrase().substring(i, i+1).equalsIgnoreCase("e")||C.getFrase().substring(i, i+1).equalsIgnoreCase("i")||C.getFrase().substring(i, i+1).equalsIgnoreCase("o"))
contadorVocales++;             
         }
         System.out.println("La cantidad de vocales de la frase es : "+contadorVocales);
     }
    
  //Método invertirFrase(), deberá invertir la frase ingresada 
  //y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     
    public void invertirFrase(Cadena C) {
        String fraseAux = "";
        for (int i = C.getLongitud(); i > 0; i--) {
            fraseAux = fraseAux.concat(C.getFrase().substring(i - 1, i));
        }
        System.out.println("La frase invertida es: " + fraseAux);
    }

//    //Método vecesRepetido(String letra), recibirá un carácter 
//    ingresado por el usuario y contabilizar cuántas veces se 
//            repite el carácter en la frase, por ejemplo:
////
    
    public void vecesRepetido(Cadena C, String o) {
        int contador = 0;
        for (int i = 0; i < C.getLongitud(); i++) {
            if (C.getFrase().substring(i, i + 1).equalsIgnoreCase(o)) {
                contador++;
            }
            
        }
        System.out.println("La cantidad de veces que aparece la letra " + o + " en la frase es : " + contador);
    }
//    
//    //Método compararLongitud(String frase), deberá comparar 
//    la longitud de la frase que compone la clase con otra nueva 
//            frase ingresada por el usuario.
    
    public void compararLongitud(Cadena C, String f) {
        if (C.getLongitud() == f.length()) {
            System.out.println("Los largos de cadena son IGUALES");
        } else if (C.getLongitud() > f.length()) {
            System.out.println("El largo de la cadena madre es MAYOR");
        } else {
            System.out.println("El largo de la cadena madre es MENOR");
        }

    }
    
//    //Método unirFrases(String frase), deberá unir la 
//    frase contenida en la clase Cadena con una nueva frase 
//            ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases (Cadena C, String k){
        System.out.println("Las frases unidas: " + (C.getFrase().concat(k)));
    }
    
//    Método reemplazar(String letra), deberá reemplazar 
//            todas las letras “a” que se encuentren en la 
//            frase, por algún otro carácter seleccionado 
//            por el usuario y mostrar la frase resultante.
    
    public void reemplazar(Cadena x, String d) {
        String frase = x.getFrase().replace("a", d);
        System.out.println(frase);
    }
    
//    Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
//            ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
    public boolean contiene(Cadena c, String d) {
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i + 1).equalsIgnoreCase(d)) {
                return true;
            }
        }
        return false;
    }

}
    

    





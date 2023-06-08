/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioCine;

import entidades.Espectador;
import entidades.Pelicula;
import enumeraciones.Nombres;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Para representar la
 * sala con los espectadores vamos a utilizar una matriz. Los asientos son
 * etiquetados por una letra y un número la fila A1 empieza al final del mapa
 * como se muestra en la tabla. También deberemos saber si el asiento está
 * ocupado por un espectador o no, si esta ocupado se muestra una X, sino un
 * espacio vacío.
 *
 * 8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
 *
 * 7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
 *
 * 6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
 *
 * 5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
 *
 * 4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
 *
 * 3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
 *
 * 2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
 *
 * 1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
 *
 * Se debe realizar una pequeña simulación, en la que se generen muchos
 * espectadores y se los ubique en los asientos aleatoriamente (no se puede
 * ubicar un espectador donde ya este ocupado el asiento). Los espectadores
 * serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
 * podrá sentar a un espectador si tiene el dinero suficiente para pagar la
 * entrada, si hay espacio libre en la sala y si tiene la edad requerida para
 * ver la película. En caso de que el asiento este ocupado se le debe buscar uno
 * libre. Al final del programa deberemos mostrar la tabla, podemos mostrarla
 * con la letra y numero de cada asiento o solo las X y espacios vacíos.
 * 
 * @author Cristian
 */
public class serviceIngreso {
    
    public Scanner leer = new Scanner(System.in);
    Random random = new Random();
    private ArrayList<Espectador> personas = new ArrayList();
    
    public Pelicula pelicula (Pelicula p){
        
        System.out.println("----- La película del día es -----");
                
        System.out.println("Los Vengadores - Endgame.");
        System.out.println("Director: Los bros Russo.");
        System.out.println("Duración: 181 minutos");
        System.out.println("Clasificación: PG-13.");
        p.setTitulo("losVengadores");
        p.setDirector("brosRusso");
        p.setDuracion(181);
        p.setEdadMinima(13);
        
        return p;
    }
    
    public ArrayList personas(){
        
        System.out.println("Cuantas personas van a ingresar: ");
        int cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            String nombre = Nombres.values()[random.nextInt(Nombres.values().length)].toString();
            int edad = (int)(Math.random()*60+10);
            int dinero = (int)(Math.random()*2500+500);
            Espectador espectador = new Espectador(nombre, edad, dinero);
            personas.add(espectador);
        }
        
        return personas;
    }
    
    
    
    public void verListas(){
        
        for (Espectador persona : personas) {
            System.out.println(persona);
        }
    }
}

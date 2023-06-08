/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author fernando
 */
public class Simulador {
    
    private Random random = new Random();
    
    /*
    Nombres
    */
    public ArrayList<String> crearNombres(){
        ArrayList<String> nombres = new ArrayList();
        
        nombres.add("Juan");
        nombres.add("Manuel");
        nombres.add("Francisco");
        nombres.add("Leanrdo");
        nombres.add("Federico");
        nombres.add("Marcelo");
        nombres.add("Natacha");
        nombres.add("Julieta");
        nombres.add("Marta");
        nombres.add("Zoila");
        nombres.add("Juana");
        nombres.add("Mirta");
        nombres.add("Fernanda");
        nombres.add("Abril");
        nombres.add("Caciano");
        nombres.add("Briam");
        nombres.add("el Yoni");
        nombres.add("Milagros");
        nombres.add("Pilar");
                
        return nombres;
    }
    
    /*
    Apellidos
    */
    
    public ArrayList<String> crearApellidos(){
        ArrayList<String> apellidos = new ArrayList();
        
        apellidos.add("Dominguez");
        apellidos.add("Herrera");
        apellidos.add("Lopez");
        apellidos.add("David");
        apellidos.add("Femenía");
        apellidos.add("Arrieta");
        apellidos.add("Sorbello");
        apellidos.add("Bellitti");
        apellidos.add("Fourcade");
        apellidos.add("Riquelme");
        apellidos.add("Aruani");
        apellidos.add("Villalba");
        apellidos.add("Castillo");
        apellidos.add("Acuña");
        apellidos.add("Aquino");
        apellidos.add("Guevara");
        apellidos.add("Olguín");
        apellidos.add("García");
        apellidos.add("Campero");
                
        return apellidos;
    }/*
    DNIs
    */
    private ArrayList<Integer> numerosUnicos(ArrayList<Integer> dnis){
        int dni = (int) (Math.random()*25000000)+25000000;
        
        boolean repite = false;
        
            for (Integer dni1 : dnis) {
                if (dni1.equals(dni)) {
                    repite = true;
                }
            }
            
            if (repite) {
                dnis = numerosUnicos(dnis);
            } else {
                dnis.add(dni);
            }
            
            return dnis;
    }
    
    public ArrayList<Integer> crearDnis(int cantidad){
        ArrayList<Integer> dnis = new ArrayList();
        
        for (int i = 0; i < cantidad; i++) {
            
            dnis = numerosUnicos(dnis);
        
        }      
                
        return dnis;
    }
    
    /*
    Crear Alumno
    */
    
    public ArrayList<Alumno> crearAlumnos(ArrayList<String> nombres,
            ArrayList<String> apellidos, ArrayList<Integer> dnis){
        //auxiliar
        ArrayList<Alumno> alumnos = new ArrayList();
        
        for (Integer dni : dnis) {
            Alumno alumno = new Alumno();
            
            alumno.setNombre(nombres.get(random.nextInt(nombres.size())));
            alumno.setApellido(apellidos.get(random.nextInt(apellidos.size())));
            alumno.setDni(dni);
            
            alumnos.add(alumno);
        }        
        
        return alumnos;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Perro;
import enumeradores.NombresPerros;
import enumeradores.RazasPerros;
import enumeradores.TamaniosPerros;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author fernando
 */
public class ServicioPerro {
    
    Random random = new Random();
    
    /*
    Crear Perro
    */
    
    public Perro crearPerro(){
        Perro perro = new Perro();
        
        perro.setNombre(NombresPerros.values()[random.nextInt(
                NombresPerros.values().length)].toString());
        perro.setEdad(random.nextInt(15)+1);
        perro.setRaza(RazasPerros.values()[random.nextInt(
                RazasPerros.values().length)].toString());
        perro.setTamanio(TamaniosPerros.values()
                [random.nextInt(TamaniosPerros.values().length)].toString());
        
        return perro;
    }
    
    
    /*
    Crear jauria
    */
    
    public ArrayList<Perro> crearJauria(int cantidad){
        ArrayList<Perro> jauria = new ArrayList();
        
        for (int i = 0; i < cantidad; i++) {
            jauria.add(crearPerro());
        }
        
        return jauria;
    }
}

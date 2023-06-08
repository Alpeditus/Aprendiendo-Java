package guia.pkg3.ext.pkg2;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import Servicio.CineServicio;

public class Guia3Ext2 {

    
    public static void main(String[] args) throws InterruptedException {
        
        Cine cine = new Cine();
        CineServicio c1 = new CineServicio();
        Pelicula p = new Pelicula();
        Espectador e = new Espectador();
        
        c1.ingresarPelicula(p);
        c1.agregarExpectadores();
        c1.inicializarSala(cine); 
        c1.asignarAsiento(cine, p, e);
        c1.mostrarSalaCine(cine);
    }
    
}

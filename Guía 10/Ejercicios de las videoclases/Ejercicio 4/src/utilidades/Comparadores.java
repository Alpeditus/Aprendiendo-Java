
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Cristian
 */
public class Comparadores {
       
    public static Comparator<Pelicula> ordenarMayorMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
//    public static Comparator<Pelicula> ordenarMenorMayor = new Comparator<Pelicula>() {
//        @Override
//        public int compare(Pelicula t, Pelicula t1) {
//            return t.getDuracion().compareTo(t1.getDuracion());
//        }
//    };
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}

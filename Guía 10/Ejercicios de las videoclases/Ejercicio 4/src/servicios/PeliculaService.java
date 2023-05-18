package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Cristian
 */
public class PeliculaService {

    private final Scanner leer;
    private final ArrayList<Pelicula> peli;
    private String pregunta;

    public PeliculaService() {
        this.leer = new Scanner(System.in);
        this.peli = new ArrayList();
    }

    public Pelicula crearPeli() {
        Pelicula pelis = new Pelicula();
        System.out.println("Ingrese el título de la película: ");
        pelis.setTitulo(leer.next());
        System.out.println("Ingrese nombre del director: ");
        pelis.setDirector(leer.next());
        System.out.println("Ingrese la duración de la película: ");
        pelis.setDuracion(leer.nextDouble());
        return pelis;
    }

    public void agregarConsultar() {
        do {
            peli.add(crearPeli());
            System.out.println("Desea agregar otra película: ");
            pregunta = leer.next();
            while (!pregunta.equalsIgnoreCase("s") & !pregunta.equalsIgnoreCase("n")) {
                System.out.println("Mal ingresado, responda con S o N: ");
                pregunta = leer.next();
            }
        } while (pregunta.equalsIgnoreCase("s"));
    }

    public void mostrarPelis() {
        //Muestra el listado de películas.
        agregarConsultar();
        System.out.println("----- Lista de películas -----");
        peli.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }

    public void mayorUno() {
        //Mostrará las películas mayores a 1 hora (Java 8 en adelante).
        System.out.println("----- Películas con duración mayor a 1 hora -----");
        peli.stream().filter((pelicula) -> (pelicula.getDuracion() > 1)).forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("");
        //Otro método:
        peli.forEach((peliculas) -> {
            if (peliculas.getDuracion() > 1) {
                System.out.println(peliculas);
            }
        });
    }
    
    public void ordenarMayorMenor(){
        Collections.sort(peli, Comparadores.ordenarMayorMenor);        
        System.out.println("----- Películas ordenadas según su duración (mayor a menor) -----");
        peli.forEach((pelicula)->{
            System.out.println(pelicula.toString());
        });
    }
    
    public void ordenarMenorMayor(){
        Collections.sort(peli, Comparadores.ordenarMayorMenor.reversed());
        System.out.println("----- Películas ordenadas según su duración (menor a mayor) -----");
        peli.forEach((pelicula)->{
            System.out.println(pelicula.toString());
        });
    }
    
    public void ordenarTitulo(){
        System.out.println("----- Lista ordenada por títulos -----");
        Collections.sort(peli, Comparadores.ordenarPorTitulo);
        peli.forEach((pelicula)->{
            System.out.println(pelicula);
        });
    }
    
    public void ordenarDirector(){
        System.out.println("----- Lista ordenada por Directores -----");
        Collections.sort(peli, Comparadores.ordenarPorDirector);
        peli.forEach((pelicula)->{
            System.out.println(pelicula);
        });
    }
}

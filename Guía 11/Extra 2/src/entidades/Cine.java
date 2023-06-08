package entidades;

/**
 * De Cine nos interesa conocer la película que se está reproduciendo, la sala
 * con los espectadores y el precio de la entrada.
 * @author Cristian
 */
public class Cine {

    private String pelicula;
    private String [][]sala = new String [8][6];
    private int precio;

    public Cine() {
    }

    public Cine(String pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine Alfa" + "\nPelicula: " + pelicula + " - Sala: " + sala + " - Precio: " + precio + ".";
    }
    
    
}

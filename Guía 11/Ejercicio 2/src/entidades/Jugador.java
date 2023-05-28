package entidades;

/**
 *
 * @author Cristian
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(Revolver r){
        r.siguienteChorro();
        if (r.mojar()) {
            mojado = true;
            return true;
        }
        return false;
    }
}

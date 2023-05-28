package entidades;

/**
 *
 * @author Cristian
 */
public class Perro {
    
    private String nombre;
    private String raza;
    private int edad;
    private long documento;
    private String tamano;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, long documento, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.documento = documento;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", documento: " + documento + ", tamano: " + tamano + '}';
    }
    
    
}

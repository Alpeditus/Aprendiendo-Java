package entidades;

import java.util.List;

/**
 *
 * @author Cristian
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private long documento;
    private Perro perro;
    private List<Perro>perros;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long documento, Perro perro, List<Perro> perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
        this.perros = perros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", edad=" + edad + ", documento=" + documento + ", \n" + perro + '}';
    }
    
}

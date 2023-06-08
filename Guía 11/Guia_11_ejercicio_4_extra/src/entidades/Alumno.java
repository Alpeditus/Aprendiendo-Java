/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author fernando
 */
public class Alumno {
    
    private String nombre;
    private String apellido;
    private int dni;
    private int votos;
    
    /*
    Constructores
    */

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int dni, int votos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.votos = votos;
    }
    
    /*
    Getters y setters
    */

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    /*
    To string
    */

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", votos=" + votos + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Facu
 */
public class Persona {

private String nombre;
private String apellido;
private dni documento;

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

    public Persona(String nombre, String apellido, dni documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + '}';
    }

    public dni getDocumento() {
        return documento;
    }

    public void setDocumento(dni documento) {
        this.documento = documento;
    }

}

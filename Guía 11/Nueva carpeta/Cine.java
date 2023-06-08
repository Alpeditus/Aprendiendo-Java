/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Cine {
    
    private Pelicula pelicula;
    private int precio;
    private String [][] salaCine = new String[8][6];

    public Cine() {
    }

    public Cine(Pelicula pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String[][] getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(String[][] sala) {
        this.salaCine = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + ", sala=" + salaCine + '}';
    }
    
}
    
    


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
public class dni {

private String serie;
private int numero;

    @Override
    public String toString() {
        return "dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public dni(String serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public dni() {
    }

}

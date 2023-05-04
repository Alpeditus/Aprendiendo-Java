/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Cristian
 */
public class Guerrero {
    
    private String nombre;
    private String clase;
    private int nivel;
    private int experiencia;
    private int vidaBase;
    private int fuerzaBase;
    private int defensaBase;
    private int agilidadBase;
    private int criticosBase;
    private int oro;

    public Guerrero() {
    }

    public Guerrero(String nombre, String clase, int nivel, int experiencia, int vidaBase, int fuerzaBase, int defensaBase, int agilidadBase, int criticosBase, int oro) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vidaBase = vidaBase;
        this.fuerzaBase = fuerzaBase;
        this.defensaBase = defensaBase;
        this.agilidadBase = agilidadBase;
        this.criticosBase = criticosBase;
        this.oro = oro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(int vidaBase) {
        this.vidaBase = vidaBase;
    }

    public int getFuerzaBase() {
        return fuerzaBase;
    }

    public void setFuerzaBase(int fuerzaBase) {
        this.fuerzaBase = fuerzaBase;
    }

    public int getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(int defensaBase) {
        this.defensaBase = defensaBase;
    }

    public int getAgilidadBase() {
        return agilidadBase;
    }

    public void setAgilidadBase(int agilidadBase) {
        this.agilidadBase = agilidadBase;
    }

    public int getCriticosBase() {
        return criticosBase;
    }

    public void setCriticosBase(int criticosBase) {
        this.criticosBase = criticosBase;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
    
    
}

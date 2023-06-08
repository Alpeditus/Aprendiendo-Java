/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class Voto {
    
    private Alumno alumno;
    private ArrayList<Alumno> votados;
    
    /*
    Constructores
    */

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }
    
    /*
    Getters y setters
    */

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }
    
    /*
    To String
    */

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", votados=" + votados + '}';
    }
    
}

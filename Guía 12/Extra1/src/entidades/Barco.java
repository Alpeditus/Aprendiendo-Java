package entidades;

import java.time.LocalDate;

/**
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación.
 *
 * @author Cristian
 */
public class Barco {

    protected int eslora;

    protected int matricula;

    protected LocalDate anioFabricacion;

    public int modulo() {
        /**
         * por un valor módulo de cada barco (obtenido simplemente multiplicando
         * por 10 los metros de eslora)
         */
        this.eslora = this.eslora * 10;
        return this.eslora;
//        return eslora * 10;
    }

    public Barco() {
    }

    public Barco(int eslora, int matricula, LocalDate anioFabricacion) {
        this.eslora = eslora;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "----Dimensiones del barco-----" + "\nEslora = " + eslora + ", matricula = " + matricula + ", año de fabricacion = " + anioFabricacion + ", ";
    }

}

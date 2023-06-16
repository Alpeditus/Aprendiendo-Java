package entidades;

import java.time.LocalDate;

/**
 *
 * @author Cristian
 */
public class BarcoMotor extends Barco {

    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(int potenciaCV, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int moduloBarcoMotor() {
        int modulo = super.modulo() + potenciaCV;
        return modulo;
    }

    @Override
    public String toString() {
        return super.toString() + "potenciaCV = " + potenciaCV + ".";
    }

}

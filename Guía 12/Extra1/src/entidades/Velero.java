package entidades;

import java.time.LocalDate;

/**
 *
 * @author Cristian
 */
public class Velero extends Barco {

    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public int moduloVelero() {
        int modulo = super.modulo() + mastiles;
        return modulo;
    }

    @Override
    public String toString() {
        return super.toString() + "mastiles = " + mastiles + ".";
    }

}

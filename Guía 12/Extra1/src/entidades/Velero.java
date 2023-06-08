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

//    public int modulo(){
//           super.eslora = super.eslora * 10 + mastiles;
//        return super.eslora;
//    }
    @Override
    public int modulo() {
        return super.modulo() * 10 + mastiles;
    }

    @Override
    public String toString() {
        return "mastiles = " + mastiles + ".";
    }
    
}

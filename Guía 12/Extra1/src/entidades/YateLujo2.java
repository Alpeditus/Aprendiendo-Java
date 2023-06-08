package entidades;

import java.time.LocalDate;

/**
 *
 * @author Cristian
 */
public class YateLujo2 extends Barco {
    
    private int camarote;
    private int potenciaCV;

    public YateLujo2() {
    }

    public YateLujo2(int camarote, int potenciaCV) {
        this.camarote = camarote;
        this.potenciaCV = potenciaCV;
    }

    public YateLujo2(int camarote, int potenciaCV, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.camarote = camarote;
        this.potenciaCV = potenciaCV;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public int modulo() {
        return super.modulo() * 10 + potenciaCV + camarote;
    }

    @Override
    public String toString() {
        return super.toString() + "camarote = " + camarote + ", potencia CV = " + potenciaCV + "."; 
    }
    
}

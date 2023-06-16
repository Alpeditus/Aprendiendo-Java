package entidades;

import java.time.LocalDate;

/**
 *
 * @author Cristian
 */
public class YateLujo extends BarcoMotor {
    
    private int camarote;

    public YateLujo() {
    }

    public YateLujo(int camarote) {
        this.camarote = camarote;
    }

    public YateLujo(int camarote, int potenciaCV) {
        super(potenciaCV);
        this.camarote = camarote;
    }

    public YateLujo(int camarote, int potenciaCV, int eslora, int matricula, LocalDate anioFabricacion) {
        super(potenciaCV, eslora, matricula, anioFabricacion);
        this.camarote = camarote;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

    public int moduloYate() {
        int modulo = super.moduloBarcoMotor() + camarote; //Modulo del padre BarcoMotor.
        return modulo; 
    }

    @Override
    public String toString() {
        return super.toString() + "camarote = " + camarote + "."; 
    }
    
    
}

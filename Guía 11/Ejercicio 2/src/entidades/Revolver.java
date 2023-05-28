package entidades;

/**
 *
 * @author Cristian
 */
public class Revolver {

    private int posActual;
    private int posAgua;

    public Revolver() {
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    public void llenarRevolver() {
        posActual = (int) (Math.random() * 6 + 1);
        posAgua = (int) (Math.random() * 6 + 1);
        System.out.println("posición actual" + posActual);
        System.out.println("posición agua" + posAgua);
    }

    public boolean mojar() {
        boolean mojar = false;
        if (posActual == posAgua) {
            mojar = true;
        }
        return mojar;
    }

    public void siguienteChorro() {
        if (posActual==6) {
            posActual=1;
        }else{
            posActual++;
        }
        
    }

    @Override
    public String toString() {
        return "Revolver: Posición actual = " + posActual + ". Posición del agua = " + posAgua + ".";
    }
    
}

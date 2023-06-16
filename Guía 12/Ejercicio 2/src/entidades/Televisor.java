package entidades;

import java.util.Scanner;

/**
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
 * los atributos heredados. Los constructores que se implementarán serán:
 *
 * • Un constructor vacío.
 *
 * • Un constructor con la resolución, sintonizador TDT y el resto de los
 * atributos heredados. Recuerda que debes llamar al constructor de la clase
 * padre. Los métodos que se implementara serán:
 *
 * • Método get y set de los atributos resolución y sintonizador TDT.
 *
 * • Método crearTelevisor(): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos los atributos del televisor.
 *
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
 * aumentará $500. Recuerda que las condiciones que hemos visto en la clase
 * Electrodomestico también deben afectar al precio.
 *
 * @author Cristian
 */
public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese resolucion del tv:");
        resolucion = leer.nextInt();
        System.out.println("Tiene sintonizador TDT: ");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("si")) {
            this.sintonizadorTDT = true;
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        // Aumentar precio según la resolución
        if (getResolucion() > 40) {
            setPrecio(getPrecio() * 1.3);
        }

        // Aumentar precio si tiene sintonizador TDT
        if (isSintonizadorTDT()) {
            setPrecio(getPrecio() + 500);
        }
    }
}

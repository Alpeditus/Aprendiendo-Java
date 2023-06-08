package entidades;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Electrodomestico { //super clase

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) { 
        /**
         * Método comprobarConsumoEnergetico(char letra): comprueba que la letra
         * es correcta, sino es correcta usara la letra F por defecto. Este
         * método se debe invocar al crear el objeto y no será visible. (letras
         * entre A y F) A | B | C | D | E | F.
         */
        letra = Character.toUpperCase(letra);
        if (letra != 'a' && letra != 'b' && letra != 'c' && letra != 'd' && letra != 'e') {
            setConsumoEnergetico('F');
        }
    }

    public void comprobarColor(String color) {
        /**
         * Comprueba que el color es correcto, y si no lo es, usa el color
         * blanco por defecto. Los colores disponibles para los
         * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si
         * el nombre está en mayúsculas o en minúsculas. Este método se invocará
         * al crear el objeto y no será visible.
         */
        color = color.toUpperCase();
        if (!"negro".equalsIgnoreCase(color) && !"azul".equalsIgnoreCase(color) && !"rojo".equalsIgnoreCase(color) && !"gris".equalsIgnoreCase(color)) {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese precio base del electrodoméstico: ");
        this.precio = leer.nextDouble() + 1000;
        System.out.println("Ingrese color del electrodoméstico: ");
        this.color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese consumo energético: ");
        String dato = leer.next();
        this.consumoEnergetico = dato.charAt(0);
        comprobarConsumoEnergetico(this.consumoEnergetico);
        System.out.println("Ingrese peso del electrodoméstico: ");
        this.peso = leer.nextInt();
    }

    public void precioFinal() {
        char aux = consumoEnergetico;
        switch (aux) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;
                break;
        }
        int peso = this.peso;
        if (peso>0&&peso<20) {
            this.precio=this.precio+100;
        }
        if (peso>19&&peso<50) {
            this.precio=this.precio+500;
        }
        if (peso>49&&peso<80) {
            this.precio=this.precio+800;
        }
        if (peso>79) {
            this.precio=this.precio+1000;
        }
    }

    @Override
    public String toString() {
        return "-----Electrodomestico-----" + "\nPrecio = " + precio + ", color = " + color + ", consumoEnergetico = " + consumoEnergetico + ", peso = " + peso + ", ";
    }    
    

}

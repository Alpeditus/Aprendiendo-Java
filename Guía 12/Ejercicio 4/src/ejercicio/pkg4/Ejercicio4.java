package ejercicio.pkg4;

import entidades.Circulo;
import entidades.Rectangulo;

/**
 * Se plantea desarrollar un programa que nos permita calcular el área y el
 * perímetro de formas geométricas, en este caso un círculo y un rectángulo. Ya
 * que este cálculo se va a repetir en las dos formas geométricas, vamos a crear
 * una Interfaz, llamada calculosFormas que tendrá, los dos métodos para
 * calcular el área, el perímetro y el valor de PI como constante. Desarrollar
 * el ejercicio para que las formas implementen los métodos de la interfaz y se
 * calcule el área y el perímetro de los dos. En el main se crearán las formas y
 * se mostrará el resultado final. Área circulo: PI * radio ^ 2 / Perímetro
 * circulo: PI * diámetro. Área rectángulo: base * altura / Perímetro
 * rectángulo: (base + altura) * 2.
 *
 * @author Cristian
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Circulo c1 = new Circulo (5);
        Rectangulo r1 = new Rectangulo(5,4);
        
        System.out.println("El area del circulo es: "+c1.area());
        System.out.println("El perimetro del circulo es: "+c1.perimetro());
        
        System.out.println("El area del rectangulo es: "+r1.area());
        System.out.println("El perimetro del rectangulo es: "+r1.perimetro());
    }

}

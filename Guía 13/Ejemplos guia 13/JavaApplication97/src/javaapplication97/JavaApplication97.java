package javaapplication97;

/**
 *
 * @author Cristian
 */
public class JavaApplication97 {

    public static void main(String[] args) {
        try {
        int division = 10 / 0;        
        } catch (ArithmeticException a){
            System.out.println("Error: " + a.getMessage());
            System.out.println("Error: " + a);
            System.out.println(a.fillInStackTrace());
        }
        
        try {
            //Se intenta hacer la división.
            int division = 10/0;
        } catch (ArithmeticException e) {
            //Si la división falla el programa va al bloque catch y se ejecuta el Sustem.out.println
            System.out.println("Error: división por cero.");
        } finally {
            //Si el programa hizo la división o no, este System.out.println se va a ejecutar igual.
            System.out.println("Saliendo del try.");
        }
    }
    
}

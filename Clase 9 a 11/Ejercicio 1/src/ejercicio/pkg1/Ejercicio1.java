/*
 Realizar un algoritmo que llene un vector con los 100 primeros números 
enteros y los muestre por pantalla en orden descendente.
 */
package ejercicio.pkg1;

/**
 *
 * @author Cristian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        crearVector();
            
    }
    public static int [] crearVector(){
        
        int [] vector=new int [100];
        for (int i = 0; i < 100; i++) {
            vector[i]=(i+1);
        }
        mostrarVector(vector);
        return vector;    
    }
    public static void mostrarVector(int [] vector){
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector [i]);
        }
    
    }
}

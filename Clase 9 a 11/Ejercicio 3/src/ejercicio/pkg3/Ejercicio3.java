/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 
dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio.pkg3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    public static final Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        
    }
    
    public static int[] rellenarVector() {
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        Random azar = new Random();

        for (int i = 0; i < n; i++) {
            vector[i] = azar.nextInt(99999);

        }
        return vector;
    }
    
    public static void contadorDigitos(int [] vector){
//        int c1=0,c2=0,c3=0,c4=0,c5=0;
//        for (int i = 0; i < vector.length; i++) {
//            double valor= vector[i];
//            double lon= Math.log10(valor);
//            if (lon<1) {
//                c1++;
//            }else{
//                if (lon<2) {
//                    c2++;
//                }else{
//                    if (lon<3) {
//                        c3++;
//                    }else{
//                        if (lon<4) {
//                            c4++;
//                        }else{
//                            if (lon<5) {
//                                c5++;
//                            }
//                        }
//                    }
//                }
//                
//            }
//        }
//        System.out.println(" ");
//        System.out.println("1 dígito = "+c1);
//        System.out.println("2 dígito = "+c2);
//        System.out.println("3 dígito = "+c3);
//        System.out.println("4 dígito = "+c4);
//        System.out.println("5 dígito = "+c5);
//    }
//}
              
        int cont=0,cont2=0,cont3=0,cont4=0,cont5=0,valor;
    
        for (int i = 0; i < vector.length; i++) {
            valor=vector[i];
            while (valor>0) {
                valor/=10;
            }
        }
    
    }
}

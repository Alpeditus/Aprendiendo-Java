/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los 
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
Nota: investigar función equals() y como convertir números a String.
 */
package extra.pkg12;

/**
 *
 * @author Cristian
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            String n=String.valueOf(i);
            if (n.equals("3")) {
                n="E";
            }
                for (int j = 0; j < 10; j++) {
                    String n2=String.valueOf(j);
                    if (n2.equals("3")) {
                    n2="E";
                    }
                    for (int k = 0; k < 10; k++) {
                        String n3=String.valueOf(k);
                        if (n3.equals("3")) {
                        n3="E";
                        }
                        System.out.println(n + "-" + n2 + "-" + n3);
                    }
   
                }
            
        }
        
    }
    
}

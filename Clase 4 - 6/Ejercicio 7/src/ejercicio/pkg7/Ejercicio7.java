/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 
caracteres de largo, el primer carácter tiene que ser X y el último 
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla 
FDE), y toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta. Al finalizar el proceso, se imprime un informe indicando la cantidad de 
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
deberá investigar cómo se utilizan las siguientes funciones de Java 
Substring(), Length(), equals().
 */
package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        String frase;
        int i=0,j=0;
        
        do {
            System.out.println("Ingrese una frase: ");
            frase=sc.nextLine().toUpperCase();
            if (frase.length()<6 && frase.substring(0,1).equals("X") && frase.substring(frase.length()-1,frase.length()).equals("O")) {
            i++;
            }else{
            if (!frase.equals("&&&&&")){
            j++;
            }
            }
        } while (!frase.equals("&&&&&"));
        
        System.out.println("Las frases correctas son: " + i);
        System.out.println("Las frases incorrectas son: " + j);
    }
    
}

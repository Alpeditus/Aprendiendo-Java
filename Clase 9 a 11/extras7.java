/*
 * Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.

 */
package Guia5;

import java.util.Scanner;
public class extras7 {
  

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de Fibonacci que desea calcular: ");
        int n = leer.nextInt();
        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.print("Los primeros " + n + " números de Fibonacci son: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

}
/*
crea un vector de tamaño n para almacenar los números de Fibonacci. Los dos primeros 
números de Fibonacci son siempre 1, por lo que se asignan manualmente a las dos primeras
posiciones del vector. Luego, calcula los siguientes números de Fibonacci
utilizando la fórmula Fibonaccin = Fibonaccin-1 + Fibonaccin-2 y los almacena en el vector.
Finalmente, el programa imprime los primeros n números de Fibonacci en la consola.
*/


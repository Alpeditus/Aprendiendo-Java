/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejercicio.pkg6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio6 {
    
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        llenarMatriz(matriz);

        System.out.println("");

        if (diagonales(matriz)) {
            if (filaColumna(matriz)) {
                System.out.println("Su cuadrado es mágico.");

            } else {
                System.out.println("Su cuadrado no es mágico.");
            }
        }
    }

    public static void llenarMatriz(int[][] matriz) {
        System.out.println("Ingrese valores: ");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                int valor = sc.nextInt();

                while (valor < 1 || valor > 9) {
                    System.out.println("El valor ingresado no es válido. Intente nuevamente: ");
                    System.out.print("[" + i + "][" + j + "] : ");
                    valor = sc.nextInt();
                }
                matriz[i][j] = valor;
            }
        }
        System.out.println("");
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean diagonales(int[][] matriz) {
        int diag1 = 0, diag2 = 0;
        boolean diag = false;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    diag1 += matriz[i][j];
                }
                if (i + j == matriz[0].length - 1) {
                    diag2 += matriz[i][j];
                }
            }
        }
        if (diag1 == diag2) {
            diag = true;
        }
        return diag;
    }

    public static boolean filaColumna(int[][] matriz) {
        int suma = 0;
        int[] fila = new int[matriz[0].length], columna = new int[matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
            fila[i] = suma;
            suma = 0;
        }

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[j][i];
            }
            columna[i] = suma;
            suma = 0;
        }

        int contfila = 0, contcolumna = 0;

        for (int i = 0; i < matriz[0].length - 1; i++) {
            if (fila[i] == fila[i + 1]) {
                contfila+=1;
            }
        }
        for (int i = 0; i < matriz[0].length - 1; i++) {
            if (columna[i] == columna[i + 1]) {
                contcolumna+=1;
            }
        }

        boolean check = false;
        if (contfila == contcolumna) {
            check = true;
        }
        return check;
    }
}


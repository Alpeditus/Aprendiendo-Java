package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Baraja {

    private ArrayList<Carta> baraja = new ArrayList();
    private Carta cartas = new Carta();
    private ArrayList<Carta> barajaMonton = new ArrayList();
    public Scanner leer = new Scanner(System.in);
    private int num;

    public void crearBaraja() {
        System.out.println("Armando la baraja...");
        String[] palos = {" oro ", " basto ", " copa ", " espada "};

        for (int i = 0; i < 12; i++) {
            if ((i + 1) != 8 & (i + 1) != 9) {
                for (int j = 0; j < 4; j++) {
                    cartas = new Carta((i + 1), palos[j]);
                    baraja.add(cartas);
                }
            }
        }
        System.out.println("Mazo armado, puede continuar.");
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta() {
        System.out.println(baraja.get(0));
        barajaMonton.add(baraja.get(0));
        baraja.remove(0);
    }

    public void mostrarBaraja() {
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }

    public void cartasDisponibles() {
        System.out.println("Las cartas disponibles son: " + baraja.size() + ".");        
    }

    public void darCartas() {
        System.out.println("Ingrese la cantidad de cartas deseada: ");
        int respuesta = leer.nextInt();

        if (baraja.size() < respuesta) {
            System.out.println("En el mazo quedan tan solo " + baraja.size() + " cartas.");
        } else {
            for (int i = 0; i < respuesta; i++) {
                System.out.print("La carta n° " + (i + 1) + " es ");
                siguienteCarta();
            }
        }
    }

    public void cartasMonton() {
        if (barajaMonton.size() == 0) {
            System.out.println("No hay cartas eliminadas.");
        } else {
            for (Carta carta : barajaMonton) {
                System.out.println(carta);
            }
        }
    }

    public void menu() {
        System.out.println("----- Bienvenidos -----");
        crearBaraja();
        System.out.println("Primero se mezclará el mazo para iniciar.");
        barajar();
        System.out.println("");
        System.out.println("Que desea hacer: ");
        System.out.println("1. Pedir carta/s.");
        System.out.println("2. Ver la cantidad de cartas disponibles en el mazo.");
        System.out.println("3. Ver el mazo de cartas disponibles.");
        System.out.println("4. Ver el mazo de cartas eliminadas.");
        System.out.println("5. Salir.");
        num = leer.nextInt();
        do {
            subMenu(num);
            System.out.println("");
            System.out.println("Elija otra opción: ");
            num = leer.nextInt();
        } while (num != 5);
        System.out.println("Hasta luego.");
    }

    public void subMenu(int num) {
        switch (num) {
            case 1:
                darCartas();
                break;
            case 2:
                cartasDisponibles();
                break;
            case 3:
                mostrarBaraja();
                break;
            case 4:
                cartasMonton();
                break;
        }
    }
}

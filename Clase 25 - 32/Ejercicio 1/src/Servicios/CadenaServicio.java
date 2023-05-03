package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);
    
    
    public void mostrarVocales(Cadena f) {

        /*
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
la frase ingresada.
         */
        int contadorVocal = 0;

        for (int i = 0; i < f.getLongitud(); i++) {

            if (f.getFrase().substring(i, i + 1).toLowerCase().equals("a") || f.getFrase().substring(i, i + 1).toLowerCase().equals("e") || f.getFrase().substring(i, i + 1).toLowerCase().equals("i") || f.getFrase().substring(i, i + 1).toLowerCase().equals("o") || f.getFrase().substring(i, i + 1).toLowerCase().equals("u")) {
                contadorVocal++;
            }

        }
        System.out.println("La frase contiene " + contadorVocal + " vocales.");
    }

    public void invertirFrase(Cadena C) {

        /*
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por 
pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
         */
//        String fraseAux = "";
//        for (int i = C.getLongitud(); i > 0; i--) {
//            fraseAux = fraseAux.concat(C.getFrase().substring(i - 1, i));
//
//        }
//        System.out.println("La frase invertida es: " + fraseAux);
        StringBuilder sb = new StringBuilder(C.getFrase());
        
        System.out.println("La frase ingresada invertida es: " + sb.reverse());
    }

    public void vecesRepetido(Cadena c, String o) {

        /*
Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
usuario y contabilizar cuántas veces se repite el carácter en la frase, por 
ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
         */
        int contador = 0;

        for (int i = 0; i < c.getLongitud(); i++) {

            if (c.getFrase().substring(i, i + 1).toLowerCase().equals(o)) {
                contador++;
            }

        }
        System.out.println("La letra elegida " + o + " se repite " + contador + " veces.");
    }

    public void compararLongitud(Cadena f, String fr) {

        /*
Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
         */
        int comparar;

        if (f.getLongitud() > fr.length()) {
            System.out.println("La primer frase es mayor que la segunda.");
        } else if (f.getLongitud() == fr.length()) {
            System.out.println("Las frases son iguales.");
        } else {
            System.out.println("La segunda frase es mayor que la primera.");
        }

    }

    public void unirFrases(Cadena f, String fr) {

        /*
Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase 
resultante.
         */
        System.out.println("Las frases unidas son: " + f.getFrase().concat(fr));
    }

    public void reemplazar(Cadena f, String fr) {

        /*
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y 
mostrar la frase resultante.
         */
        String frase = f.getFrase().replace("o", fr);
        System.out.println(frase);

    }

    public boolean contiene(Cadena f) {

        /*
Método contiene(String letra), deberá comprobar 
si la frase contiene una letra que ingresa el usuario y devuelve verdadero si 
la contiene y falso si no.
         */
        System.out.println("Ingrese la letra a buscar: ");
        String letra = leer.next();
//        boolean buscador = false;
//        for (int i = 0; i < f.getLongitud(); i++) {
//
//            if (f.getFrase().substring(i, i + 1).toLowerCase().equalsIgnoreCase(letra)) {
//                buscador = true;
//                System.out.println("La letra se encuentra en la frase.");
//                break;
//            }else{
//                System.out.println("");
//            }
//        }
        return f.getFrase().contains(letra);
    }
}

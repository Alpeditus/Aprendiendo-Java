package servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Cristian
 */
public class practica {

    public void lista() {
        //Ejemplo de un ArrayList de números:
        ArrayList<Integer> numerosA = new ArrayList();
        int x;
        x = 20;
        numerosA.add(x); //Agregamos el número 20 a la lista, en la posición 0.
        x = 10;
        numerosA.add(x);
        x = 0;
        numerosA.add(x);
        x = 30;
        numerosA.add(x);
        x = 40;
        numerosA.add(x);
        //RECORRER UNA COLECCIÓN:
        //Mostramos los elementos a través de la variable.
        for (Integer aux1 : numerosA) {
            System.out.println(aux1);
        }
        //ELIMINAR
        /**
         * Las listas constan de dos métodos:
         *
         * • remove(int índice): Este método remueve un elemento de un índice
         * especifico. Esto mueve los elementos, de manera que no queden índices
         * sin elementos.
         *
         * • remove(elemento): Este método remueve la primera aparición de un
         * elemento a borrar en una lista
         */
        numerosA.remove(0); //Este núemro se encuentra en el índice 0.
        numerosA.remove(40);//Eliminamos el número 40 o el primer 40 que encuentre.
        for (Integer aux1 : numerosA) {
            System.out.println(aux1);
        }

        //Ejemplo de una LinkedList de números:
        LinkedList<Integer> numerosC = new LinkedList();
    }

    public void conjuntos() {
        //Ejemplo de un HashSet de números:
        HashSet<Integer> numerosB = new HashSet();
        Integer y;
        y = 10;
        numerosB.add(y);
        y = 10;
        numerosB.add(y);
        y = 20;
        numerosB.add(y);
        y = 30;
        numerosB.add(y);
        y = 40;
        numerosB.add(y);
        //RECORRER UNA COLECCIÓN:
        for (Integer aux2 : numerosB) {
            System.out.println(aux2);
        }
        //ELIMINAR
        /**
         * Ya que los conjuntos no constan de índices, solo se puede borrar por
         * elemento.
         *
         * remove(elemento): Este método remueve la primera aparición de un
         * elemento a borrar en un conjunto.
         */
        numerosB.remove(40); //Eliminamos el número 40.
        for (Integer aux2 : numerosB) {
            System.out.println(aux2);
        }

        //Ejemplo de un TreeSet de números:
        TreeSet<Integer> numeros = new TreeSet();

        //Ejemplo de un LinkedHashSet de cadenas:
        LinkedHashSet<String> frases = new LinkedHashSet();
    }

    public void mapas() {
        //Ejemplo de un HashMap de personas:
        //HashMap<Llave, Valor> indentificador = new HashMap(); //Como se arma el HashMap
        HashMap<Integer, String> personasA = new HashMap();
        int dni = 30235021;
        String nombreAlumno = "Silvana";
        personasA.put(dni, nombreAlumno); //Agregamos la llave y el valor.
        dni = 12345678;
        nombreAlumno = "Juan";
        personasA.put(dni, nombreAlumno);
        dni = 12345673;
        nombreAlumno = "Juan";
        personasA.put(dni, nombreAlumno);
        dni = 12345278;
        nombreAlumno = "Juan";
        personasA.put(dni, nombreAlumno);
        dni = 12345478;
        nombreAlumno = "Juan";
        personasA.put(dni, nombreAlumno);
        //RECORRER UNA COLECCIÓN:
        //Recorrer las dos partes del mapa.
        //entry.getKey trae la llave y entry.getValue trae los valoers del mapa.
        for (Map.Entry<Integer, String> entry : personasA.entrySet()) {
            System.out.println("Documento = " + entry.getKey() + ", nombre = " + entry.getValue());
        }
        //Sin Map.Entry
        //Mostrar solo las llaves.
        for (Integer doc : personasA.keySet()) {
            System.out.println("Documento: " + doc);
        }
        //Mostrar solo los valores
        for (String nombres : personasA.values()) {
            System.out.println("Nombre: " + nombres);
        }
        //ELIMINAR
        /**
         * La parte más importante de los elementos de un mapa es la llave del
         * elemento, que es la que hace el elemento único, por eso en los mapas
         * solo podemos remover un elemento por su llave.
         *
         * remove(llave): Este método remueve la primera aparición de la llave
         * de un elemento a borrar en un mapa.
         */
        personasA.remove(3); //Borramos la llave 3.
        for (Map.Entry<Integer, String> entry : personasA.entrySet()) {
            System.out.println("Documento = " + entry.getKey() + ", nombre = " + entry.getValue());
        }
        //Sin Map.Entry
        //Mostrar solo las llaves.
        for (Integer doc : personasA.keySet()) {
            System.out.println("Documento: " + doc);
        }
        //Mostrar solo los valores
        for (String nombres : personasA.values()) {
            System.out.println("Nombre: " + nombres);
        }

        //Ejemplo de un TreeMap de personas:
        TreeMap<Integer, String> personasB = new TreeMap();

        //Ejemplo de un LinkedHashMap de personas:
        LinkedHashMap<Integer, String> personasC = new LinkedHashMap();
    }

    public void deteccionErrores1() {
        /**
         * MANOS A LA OBRA – DETECCIÓN DE ERRORES Corrige el siguiente código:
         * Array<int> listado = new ArrayList; TreeSet<String> = TreeSet();
         * HashMap<Integer> personas = new HashMap<>;
         */
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> variable = new TreeSet();
        HashMap<String, Integer> personas = new HashMap();

    }

    public void deteccionErrores2() {
        /**
         * MANOS A LA OBRA – DETECCIÓN DE ERRORES
         *
         * HashMap<Integer> personas = new HashMap<>; String n1 = “Albus”;
         * String n2 = “Severus”; personas.add(n1); personas.add(n2);
         */
        HashMap<String, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(n1, n2);
    }

    public void iterator() {
        ArrayList<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");
        lista.add("Y");
        lista.add("C");
        lista.add("Z");

        //Creamos el Iterator para recorrer la lista.
        Iterator iterator = lista.iterator(); //Devolvemos el iterador.
        System.out.println("Elementos de la lista: ");

        //Armamos un bucle while, siempre que el hasnext() devuelva true.
        while (iterator.hasNext()) { //Mostramos los elementos con el iterator.next()
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public void eliminarIterator() {
        //LISTA
        ArrayList<String> palabras = new ArrayList();
        palabras.add("A");
        palabras.add("B");
        palabras.add("Y");
        palabras.add("C");
        palabras.add("Z");
        Iterator<String> it = palabras.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Y")) { //Borramos si está la palabra HOLA.
                it.remove();
            }
        }
        //CONJUNTOS
        HashSet<Integer> numerosSet = new HashSet();
        numerosSet.add(1);
        numerosSet.add(2);
        numerosSet.add(3);
        numerosSet.add(4);
        numerosSet.add(5);
        Iterator<Integer> it2 = numerosSet.iterator();
        while (it2.hasNext()) {
            if (it2.next() == 3) {
                it2.remove();
            }
        }
    }

    public void deteccionErrores3() {
        /**
         * MANOS A LA OBRA - DETECCIÓN DE ERRORES ArrayList<String> = new
         * ArrayList() bebidas.put(“café); bebidas.add(“té”); Iterator<String>
         * it =bebidas.iterator(); whale (it.next()){ if
         * (it.next().equals(“café”)){ it.remove(); }
         */

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        bebidas.add("mate");

        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("mate")) {
                it.remove();
            }
        }
        System.out.println("La lista de bebidas es: ");
        for (String aux : bebidas) {
            System.out.println(aux);
        }
    }

    public void ordenarColeccion() {

        //LISTAS:
        ArrayList<Integer> numeros = new ArrayList();
        Collections.sort(numeros);

        //CONJUNTOS:
        HashSet<Integer> numerosSet = new HashSet();
        //Se convierte el HashSet a Lista.
        ArrayList<Integer> numerosLista = new ArrayList(numerosSet);
        Collections.sort(numerosLista);

        //MAPAS:
        HashMap<Integer, String> alumnos = new HashMap();
        //Se convierte el HashMap a TreeMap
        TreeMap<Integer, String> alumnosTree = new TreeMap(alumnos);
    }

    public void comparator() {
        //AÑADIR UN OBJETO A UNA COLECCIÓN:

        //LISTAS:
        ArrayList<Libro> libros = new ArrayList();
        Libro libro = new Libro();
        libros.add(libro);

        //CONJUNTOS:
        HashSet<Perro> perros = new HashSet();
        Perro perro = new Perro();
        perros.add(perro);

        //MAPAS:
        HashMap<Integer, Alumno> alumnos = new HashMap();
        int dni = 34576189;
        Alumno alumno = new Alumno("Pepe", "Honguito");
        alumnos.put(dni, alumno);

        //RECORRER UNA COLECCIÓN CON OBJETOS:
        ArrayList<Libro> libros = new ARrayList();
        Libro libro = new Libro();
        libros.add(libro);
        for (Libro ejemplar : libros) {
            System.out.println(ejemplar);
        }
        /**
         * Cuando queremos mostrar el libro, que está siendo recorrido por el
         * for each, nos mostraría algo así: Libreria.Libro@14ae5a5 Para
         * solucionar este problema, vamos a tener que sobrescribir(Override),
         * un método de la clase String dentro de la clase de nuestro objeto.
         * Este método va a transformar, el nombre de la clase, el nombre del
         * objeto y el hash, en una cadena legible para imprimir. Para poder
         * usar este método vamos a ir a nuestra clase, ahí hacemos click
         * derecho, insert code y le damos a toString(). Eso nos va a generar un
         * método toString() con los atributos de nuestro objeto y que retorna
         * una cadena para mostrar el objeto.
         */
        @Override
        public String toString(){
        return "Libro{" + "titulo=" + titulo + '}';
        }
        
    }
    
    public void coleccionesFunciones(){
        //LISTAS
        //EN LA CLASE:
        public void llenarLista(ArrayList<Integer>numeros){
            numeros.add(20);
        }
        //MAIN
        ArrayList<Integer> notas = new ArrayList();
        //Le pasamos la lista a la función
        service.llenarLista(notas);
        
        //CONJUNTOS
        //EN LA CLASE:
        public void llenarHashSet(HashSet<String>palabras){
            palabras.add("hola");
        }
        //MAIN
        HashSet<String>palabras = new HashSet();
        //Le pasamos el conjunto a la función.
        service.llenarHashSet(palabras);
        //MAIN
        HashMap<Integer,String>alumnos = new HashMap();
        //Le pasamos el conjunto a la función.
        service.llenarMapa(alumnos);
    }

}

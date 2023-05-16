package alumnoService;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class servicioAlumno {

    private final Scanner leer;
    private final List<Alumno> lista;
    private String nombre, pregunta;

    public servicioAlumno() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.lista = new ArrayList();
    }

    public Alumno crearAlumno() {
        ArrayList<Double> notas = new ArrayList<>();
        Alumno al = new Alumno();
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = leer.next();
        al.setNombre(nombre);
        System.out.println("Ingrese las 3 notas: ");
        for (int i = 0; i < 3; i++) {
            double nota = leer.nextInt();
            notas.add(nota);
        }
        al.setNotas(notas);

        return al;
    }

    public void agregarLista() {

        lista.add(crearAlumno());
    }

    public void consultarAgregar() {
        do {
            agregarLista();
            System.out.println("Desea agregar otro alumno (S/N): ");
            pregunta = leer.next();
            while (!pregunta.equalsIgnoreCase("s") & !pregunta.equalsIgnoreCase("n")) {
                System.out.println("Mal ingresado, responda con S o N: ");
                pregunta = leer.next();
            }
        } while (pregunta.equalsIgnoreCase("s"));
    }

    public void notaFinal() {
        Iterator<Alumno> it = lista.iterator();
        boolean respuesta = false;
        System.out.println("Ingrese el alumno que desea calcular su nota final: ");
        nombre = leer.next();
        double promedio = 0;
        for (Alumno aux : lista) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                ArrayList<Double> notas = aux.getNotas();
                for (Double aux2 : notas) {
                    promedio += aux2;
                }
                promedio /= notas.size();
                System.out.println("El promedio del alumno " + aux.getNombre() + " es " + promedio + ".");
                respuesta = true;
            }
        }
        if (!respuesta) {
            System.out.println("El alumno no se encuentra en la lista.");
        }
    }
}

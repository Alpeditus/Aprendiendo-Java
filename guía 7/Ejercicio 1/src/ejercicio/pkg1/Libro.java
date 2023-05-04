package ejercicio.pkg1;

import java.util.Scanner;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPagina;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numeroPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }

    public Libro(String isbn, String titulo, String autor, String numeroPagina) {

        System.out.print("Ingrese ISBN: ");
        isbn = sc.next();
        System.out.print("Ingrese Título: ");
        titulo = sc.next();
        System.out.print("Ingrese Autor: ");
        autor = sc.next();
        System.out.print("Ingrese Número de páginas: ");
        numeroPagina = sc.next();

    }
}

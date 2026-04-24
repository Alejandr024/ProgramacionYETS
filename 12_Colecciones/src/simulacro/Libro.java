package simulacro;

import java.io.Serializable;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Libro implements Serializable, Comparable<Libro> {

    private String titulo;
    private String autor;
    private int year;
    private String isbn;
    private int numPages;

    public Libro(String titulo, String autor, int year, String isbn, int numPages) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
        this.isbn = isbn;
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return titulo + "\t" + autor + "\t" + year + "\t" + isbn + "\t" + numPages;
    }

    public boolean equal(Libro libro) {
        boolean igual = false;

        if (getIsbn().equals(libro.getIsbn())) {
            igual = true;
        }

        return igual;
    }

    @Override
    public int compareTo(Libro libro) {
        return getTitulo().compareTo(libro.getTitulo());
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return numPages;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
}//end class


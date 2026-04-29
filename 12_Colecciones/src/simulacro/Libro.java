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
        return String.format("%-50s%-40s%-10d%-50s%-40d",titulo,autor,year,isbn,numPages);
    }

    public boolean equals(Libro libro) {
        if(this == libro) return true;
        if(libro == null || this.getClass() != libro.getClass()) return false;
        
        return this.getIsbn().equals(libro.getIsbn());
        // return Objects.equals(ibsn,libro.isbn);
    }

    @Override
    public int compareTo(Libro libro) {
        return this.getTitulo().compareToIgnoreCase(libro.getTitulo());
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


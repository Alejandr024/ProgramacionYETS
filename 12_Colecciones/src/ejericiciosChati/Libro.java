package ejericiciosChati;

import java.io.Serializable;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Libro implements Serializable{

    private String isbn;
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String isbn, String titulo, String autor, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    
    

    @Override
    public String toString() {
        return isbn + "\t" + titulo + "\t" + autor + "\t" + precio;
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
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}//end class

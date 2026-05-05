package examen20260430ColeccionesB;

import java.io.Serializable;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Pelicula  implements Serializable, Comparable<Pelicula>{
    private String titulo;
    private String director;
    private String estudio;
    private double tiempo;
    private String genero;

    public Pelicula(String titulo, String director, String estudio, double tiempo, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.estudio = estudio;
        this.tiempo = tiempo;
        this.genero = genero;
    }

    @Override
    public int compareTo(Pelicula pelicula) {
        return (int) this.getTiempo() - (int) pelicula.getTiempo();
    }
    
    @Override
    public String toString() {
        return String.format("\"%-20s\" %-20s (%-5s min) Estudio:%-20s", getTitulo(), getDirector(), getTiempo(), getEstudio());
    }

    public boolean equals(Pelicula pelicula) {
        if (this == pelicula) {
            return true;
        }
        if (pelicula == null || this.getClass() != pelicula.getClass()) {
            return false;
        }

        return this.getTitulo().equals(pelicula.getTitulo());
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @return the estudio
     */
    public String getEstudio() {
        return estudio;
    }

    /**
     * @return the tiempo
     */
    public double getTiempo() {
        return tiempo;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }
    
    
}//end class

package examen20260430ColeccionesA;

import java.io.Serializable;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Cancion implements Serializable, Comparable<Cancion>{
    private String titulo;
    private String grupo;
    private String album;
    private double tiempo;
    private String estilo;

    public Cancion(String titulo, String grupo, String album, double tiempo, String estilo) {
        this.titulo = titulo;
        this.grupo = grupo;
        this.album = album;
        this.tiempo = tiempo;
        this.estilo = estilo;
    }

    @Override
    public int compareTo(Cancion c) {
        return (int) this.getTiempo() - (int) c.getTiempo();
    }

    @Override
    public String toString() {
        return String.format("%-5s - %-5s (%-5s min) - Album: %-5s", getTitulo(), getGrupo(), getTiempo(), getAlbum());
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @return the tiempo
     */
    public double getTiempo() {
        return tiempo;
    }

    /**
     * @return the estilo
     */
    public String getEstilo() {
        return estilo;
    }
    
}//end class
package examen20260430ColeccionesB;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class AdminBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Die Hard", "John", "20th Century Fox", 132.0, "accion");
        Pelicula pelicula2 = new Pelicula("Superbad", "Gre", "Columbia", 113.0, "Comedia");
        Pelicula pelicula3 = new Pelicula("The GodFather", "Francis", "Paramount", 175.0, "Drama");

        HashSet<Pelicula> peliculas = new HashSet<>();

        addPelicula(pelicula1, peliculas);
        addPelicula(pelicula2, peliculas);
        addPelicula(pelicula3, peliculas);
        addPelicula(pelicula1, peliculas);

        System.out.println("--Peliculas ordenadas por titulo--");
        mostrarPorTitulo(peliculas);

        reproducirPelicula(pelicula1, "Netflix");

    }//end main

    static void reproducirPelicula(Pelicula pelicula, String nombre) {
        System.out.println("Reproduciendo pelicula en " + nombre);

        System.out.println(pelicula);
    }

    static void addPelicula(Pelicula pelicula, HashSet<Pelicula> peliculas) {

        boolean igual = false;

        for (Pelicula p : peliculas) {
            if (pelicula.equals(p)) {
                igual = true;
                break;
            }
        }

        if (igual) {
            System.out.println("No se puede agregar la pelicula, pues ya existe en la coleccion.");
        } else {
            peliculas.add(pelicula);
            System.out.println("Pelicula agregada: " + pelicula);
        }
    }

    static void mostrarPorTitulo(HashSet<Pelicula> peliculas) {
        Comparator<Pelicula> porTitulo = Comparator.comparing(Pelicula::getTitulo);
        TreeSet<Pelicula> ordenarPeliculas = new TreeSet<>(porTitulo);

        ordenarPeliculas.addAll(peliculas);

        Iterator<Pelicula> peliculasPorTitulo = ordenarPeliculas.iterator();

        while (peliculasPorTitulo.hasNext()) {
            System.out.println(peliculasPorTitulo.next());
        }
    }

}//end class

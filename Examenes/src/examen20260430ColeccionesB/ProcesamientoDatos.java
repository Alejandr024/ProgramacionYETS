package examen20260430ColeccionesB;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class ProcesamientoDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Pelicula> peliculas = new HashSet<>();
        Pelicula pelicula1 = new Pelicula("Die Hard", "John", "20th Century Fox", 132.0, "accion");
        Pelicula pelicula2 = new Pelicula("Superbad", "Greg", "Columbia", 113.0, "Comedia");
        Pelicula pelicula3 = new Pelicula("The GodFather", "Francis", "Paramount", 175.0, "Drama");

        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        Iterator<Pelicula> it = peliculas.iterator();
        System.out.println("Peliculas menores a 150 de tiempo: ");

        while (it.hasNext()) {
            if (it.next().getTiempo() > 150) {
                it.remove();
            }
        }

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

        HashSet<Pelicula> peliculasDeNuevo = new HashSet<>();

        peliculasDeNuevo.add(pelicula1);
        peliculasDeNuevo.add(pelicula2);
        peliculasDeNuevo.add(pelicula3);

        System.out.println("----------------");
        System.out.println("Peliculas mostradas por titulo en orden alfabetico:");

        mostrarPorTitulo(peliculasDeNuevo);

        System.out.println("----------------");
        porGenero(peliculas, "Accion");

    }//end main

    static void porGenero(HashSet<Pelicula> peliculas, String genero) {
        System.out.println("Peliculas por el genero " + genero);
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(pelicula);
            }
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

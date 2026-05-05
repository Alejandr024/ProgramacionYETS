package examen20260430ColeccionesB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class MainPelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String accion = "Accion";
        List<Pelicula> accionLista = new ArrayList<>();
        Catalogo catalogoAccion = new Catalogo(accion, accionLista);

        String drama = "Drama";
        List<Pelicula> dramaLista = new ArrayList<>();
        Catalogo catalogoDrama = new Catalogo(drama, dramaLista);

        String terror = "Terror";
        List<Pelicula> terrorLista = new ArrayList<>();
        Catalogo catalogoTerror = new Catalogo(terror, terrorLista);

        String comedia = "Comedia";
        List<Pelicula> comediaLista = new ArrayList<>();
        Catalogo catalogoComedia = new Catalogo(comedia, comediaLista);

        try (BufferedReader in = new BufferedReader(new FileReader("peliculas.txt"))) {
            //in.readLine(); en caso de que tenga titulo y algunos saltso de linea
            // linea= linea.trim(); en caso de que haya espacios en blanco
            String linea = in.readLine();
            linea = in.readLine();

            String[] peliculaAux = new String[0];
            while (linea != null) {

                if (linea.isEmpty()) { //en el caso que este vacio
                    continue;
                }
                linea= linea.trim();
                peliculaAux = linea.split(",,");
                if (peliculaAux.length == 5) {
                    double tiempo = Double.parseDouble(peliculaAux[3].replace(",", "."));
                    Pelicula pelicula = new Pelicula(peliculaAux[0], peliculaAux[1], peliculaAux[2], tiempo, peliculaAux[4]);
                    if (pelicula.getGenero().equalsIgnoreCase("Accion")) {
                        catalogoAccion.addPelicula(pelicula);
                    } else if (pelicula.getGenero().equalsIgnoreCase("drama")) {
                        catalogoDrama.addPelicula(pelicula);
                    } else if (pelicula.getGenero().equalsIgnoreCase("terror")) {
                        catalogoTerror.addPelicula(pelicula);
                    } else if (pelicula.getGenero().equalsIgnoreCase("comedia")) {
                        catalogoComedia.addPelicula(pelicula);
                    }
                }
                linea = in.readLine();
            }
            
            System.out.println("----------------");
            catalogoAccion.mostrarPeliculasOrdenadas();
            System.out.println("----------------");
            catalogoDrama.mostrarPeliculasOrdenadas();
            System.out.println("----------------");
            catalogoTerror.mostrarPeliculasOrdenadas();
            System.out.println("----------------");
            catalogoComedia.mostrarPeliculasOrdenadas();

           catalogoAccion.guardarArchivo("accion.dat", accion);
           catalogoDrama.guardarArchivo("drama.dat", drama);
           catalogoTerror.guardarArchivo("terror.dat", terror);
           catalogoComedia.guardarArchivo("comedia.dat", comedia); 
           
           catalogoAccion.cargarDesdeArchivo("accion.dat", accion);
           catalogoDrama.cargarDesdeArchivo("drama.dat", drama);
           catalogoTerror.cargarDesdeArchivo("terror.dat", terror);
           catalogoComedia.cargarDesdeArchivo("comedia.dat", comedia); 
           
           
        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
        }

    }//end main

}//end class

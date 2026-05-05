package examen20260430ColeccionesB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Catalogo implements Serializable {

    String nombreCatalogo;
    List<Pelicula> peliculas;

    public Catalogo(String nombreCatalogo, List<Pelicula> peliculas) {
        this.nombreCatalogo = nombreCatalogo;
        this.peliculas= peliculas;
    }

    public void addPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
       System.out.println("Pelicula agregada: " + pelicula);
    }

    public void mostrarPeliculasOrdenadas() {
        peliculas.sort(null);
        
        System.out.println("Catalogo: " + nombreCatalogo);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }

    public void guardarArchivo(String rutaArchivo, String nombreCatalogoC){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            oos.writeObject(this);

            System.out.println(nombreCatalogoC + " guardado en " + rutaArchivo);

        } catch (Exception e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }
    }
    
    public void cargarDesdeArchivo(String rutaArchivo, String nombreCatalogo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            Catalogo p= (Catalogo) ois.readObject();
            System.out.println("\n--- Catalogo " + nombreCatalogo+ " cargado desde "+ rutaArchivo +"---");
            p.mostrarPeliculasOrdenadas();
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: "  + e.getMessage());
        } catch(ClassNotFoundException e){
            System.err.println("Error al encontrar la clase: " + e.getMessage());
        }
    }
    
}//end class

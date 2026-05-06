package examen20260430ColeccionesA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class Playlist implements Serializable{

    String nombre;
    List<Cancion> canciones;

    public Playlist(String nombre, List<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public void addCancion(Cancion cancion) {
        canciones.add(cancion);

        System.out.println("Cancion agregada: " + cancion);
    }

    public void mostarCancionesOrdenada() {
        canciones.sort(null);

        System.out.println("Playlist: " + nombre);
        for (Cancion cancion : canciones) {
            System.out.println(cancion);
        }
    }

    public void guardarArchivo(String ruta) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(this);

            System.out.println("Playlist guardada en " + ruta + ".");

        } catch (FileNotFoundException e) {
            System.err.println("No se encuentra el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void cargarDesdeArchivo(String ruta) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {

            Playlist play = (Playlist) ois.readObject();

            System.out.println("-----Estilo " + nombre + " cargado desde " + ruta + ".-----");
            play.mostarCancionesOrdenada();

        } catch (ClassNotFoundException e) {
            System.err.println("No se encuentra la clase: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

}//end class

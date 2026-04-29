package simulacro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class GestionBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreBiblio = "Biblioteca Central";
        String ciudad = "San Cristobal de La Laguna";
        Biblioteca biblioteca = new Biblioteca(nombreBiblio, ciudad);

        try (BufferedReader in = new BufferedReader(new FileReader("libros.txt"))) {
            //in.readLine(); en caso de que tenga titulo y algunos saltso de linea
            // linea= linea.trim(); en caso de que haya espacios en blanco
            String linea = in.readLine();

            String[] libroAux = new String[0];
            while (linea != null) {
                /*
                if(linea.isEmpy()){ en el caso que este vacio
                    continue;
                }
                 */
                libroAux = linea.split(" - ");
                if (libroAux.length == 5) {
                    int numPages = Integer.parseInt(libroAux[4]);
                    int year = Integer.parseInt(libroAux[2]);
                    Libro libro = new Libro(libroAux[0], libroAux[1], year, libroAux[3], numPages);
                    biblioteca.agregar(libro);
                }
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
        }
        
        biblioteca.getLibros().sort(null);
        biblioteca.mostrar();
        System.out.println("-----------------");
        System.out.println("Busqueda de libro: ");
        biblioteca.buscarPorIsbn("978.0.452.28423.4");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.dat"))) {
            oos.writeObject(biblioteca);
            System.out.println("Biblioteca guardado con exito en biblioteca.dat.");
        } catch (FileNotFoundException e) {
            System.err.println("Error al crear el archivo binario.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo.");
        }
    }//end main

}//end class

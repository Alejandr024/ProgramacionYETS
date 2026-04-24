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
            String linea = in.readLine();
            String[] libroAux = new String[0];
            while (linea != null) {
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
            System.out.println("Error al leer el archivo.");
        }

        biblioteca.mostrar();
        System.out.println("-----------------");
        System.out.println("Busqueda de libro: ");
        biblioteca.buscarPorIsbn("978.0.452.28423.4");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.dat"))) {
            oos.writeObject(biblioteca);
            System.out.println("Biblioteca guardado con exito en biblioteca.dat.");
        } catch (FileNotFoundException e) {
            System.out.println("Error al crear el archivo binario.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }
    }//end main

}//end class

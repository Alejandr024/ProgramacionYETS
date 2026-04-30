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

    /* Vaina de Samuel
    
        // Crear y manipular una pila de enteros
        Stack<Integer> pila = new Stack<>();

        pila.push(1);
        // Pila: [1]
        //pila.push (2);    // Pila: [1, 2]
        //pila.push (3);    // Pila: [1, 2, 3] (3 es el tope)
        //    size() : Devuelve el número de elementos presentes
        //search(Object o): Busca un elemento y devuelve su posición desde el tope (empezando en 1).
        int elemento = pila.pop(); // Devuelve 3. Pila: [1, 2]
        int tope = pila.peek();    // Devuelve 2, pero no lo elimina.
    
    
        private static void guardarBiblioteca(String rutaArchivo, Biblioteca biblioteca) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {

            // Escribir cabecera de la biblioteca
            bw.write(biblioteca.getNombreBi() + " - " + biblioteca.getCiudad());
            bw.newLine();

            // Escribir cada libro en el mismo formato que libros.txt
            for (Libro libro : biblioteca.getListaLibros()) {
                bw.write(libro.getTitulo() + " - "
                        + libro.getAutor() + " - "
                        + libro.getYear() + " - "
                        + libro.getIsbn() + " - "
                        + libro.getNumeroPa());
                bw.newLine();
            }

            System.out.println("Biblioteca guardada en " + rutaArchivo);

        } catch (Exception e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }
    }

    private static void cargarBiblioteca(String rutaArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            Biblioteca b = (Biblioteca) ois.readObject();
            System.out.println("\n--- Biblioteca cargada desde .dat ---");
            b.mostrarLibros();
        } catch (Exception e) {
            System.err.println("Error al cargar el archivo binario: " + e.getMessage());
        }
    }
    
    
     */
}//end class

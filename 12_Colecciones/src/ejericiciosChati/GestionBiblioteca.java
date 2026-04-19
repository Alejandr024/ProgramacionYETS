package ejericiciosChati;

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

        String nombreBiblio = "Skbidi Biblioteca";
        String ciudad = "Santa Cruz de Tenerife";
        int numberLine = 0;
        Biblioteca biblioteca = new Biblioteca(nombreBiblio, ciudad);

        try (BufferedReader in = new BufferedReader(new FileReader("libros.txt"))) {
            String linea = in.readLine();
            String[] libroAux = new String[0];
            while (linea != null) {
                numberLine++;
                libroAux = linea.split(";");
                if (libroAux.length == 4) {
                    try {
                        double precio = Double.parseDouble(libroAux[3].replace(",", "."));//reemplaza las comas por un punto en los precios, asi evitamos error de numberFormat
                        Libro libro = new Libro(libroAux[0], libroAux[1], libroAux[2], precio);
                        biblioteca.agregar(libro);
                    } catch (NumberFormatException e) {
                        System.out.println("Precio invalido en linea: " + numberLine);
                        break;
                    }
                }
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        biblioteca.mostrar();

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

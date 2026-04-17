package ejericicoPreSimulacro;

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
public class GestionConcesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreConcesionario = "Automax";
        String ciudad = "La Laguna";
        Concesionario concesionario = new Concesionario(nombreConcesionario, ciudad);

        try (BufferedReader in = new BufferedReader(new FileReader("coches.txt"))) {
            String linea = in.readLine();
            String[] coche = new String[0];

            while ((linea = in.readLine()) != null) {
                coche = linea.split("::");

                if (coche.length == 4) {
                    int year = Integer.parseInt(coche[2]);
                    double velmax = Double.parseDouble(coche[3]);
                    Coche cocheAux = new Coche(coche[0], coche[1], year, velmax);
                    concesionario.appendCar(cocheAux);
                }
                linea = in.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }

        concesionario.mostrarCoches();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("concesionario.dat"))) {
            oos.writeObject(concesionario);
            System.out.println("Concesionario guardado en concesionario.dat.");
        } catch (FileNotFoundException e) {
            System.out.println("Error al crear el archivo binario.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }

    }//end main

}//end class

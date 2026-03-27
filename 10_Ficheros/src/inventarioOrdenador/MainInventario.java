package inventarioOrdenador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class MainInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (BufferedReader inBuffer = new BufferedReader(new FileReader("ficheros/productos.txt"))) {
            String linea = inBuffer.readLine();//leo una linea del fichero y lo guardo
            String[] objeto = new String[0];
            Inventario agenda = new Inventario();
            while (linea != null) {//creamos un while para que agrege cada linea al array objetos y los separe por los puntos y comas
                objeto = linea.split(";");//creo un array con los elementos de la linea, los seprara por medio de los puntos y comas
                /*creamos un contacto con el constructo del mismo pasandole los datos del objeto, tienen que estar ordenados y bien colocados para que no de error
                (el id, doulbe y boolean del fichero hay que inicializarlos como wrapper (es decir, como objetos) para que funcione el fichero.)*/
                ProductoOrdenador productoAux = new ProductoOrdenador(Integer.valueOf(objeto[0]), objeto[1], Double.valueOf(objeto[2]), Boolean.valueOf(objeto[3]));
                agenda.append(productoAux);
                linea = inBuffer.readLine();//leo una linea del fichero y lo guardo
            }

            System.out.println(agenda);
        } catch (IOException ex) {//casos si el fichero no existe, esta corrupto, etc.

            System.out.println("Excepcion: " + ex.getMessage());
        }

    }//end main

}//end class

package ficheros_Objetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class MainAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Contacto juan = new Contacto("Juan", "Perez", "55512344Q", "666777888", 18);

        BufferedReader inBuffer = null;
        try {
            inBuffer = new BufferedReader(new FileReader("objetos.txt"));
            String linea = inBuffer.readLine();//leo una linea del fichero y lo guardo
            String[] objeto = new String[0];
            Contacto[] arrayContactos = {juan};
            Agenda agenda = new Agenda(arrayContactos);
            while (linea != null) {//creamos un while para que agrege cada linea al array objetos y los separe por las comas
                objeto = linea.split(" , ");//creo un array con los elementos de la linea, los seprara por medio de las comas
                // creamos un contacto con el constructo del mismo pasandole los datos del objeto, tienen que estar ordenados y bien colocados para que no de errorl
                //(la edad en el fichero se detecta como un string, lo pasamos a numero para que haga bien el constructor)
                Contacto contactoAux = new Contacto(objeto[0], objeto[1], objeto[2], objeto[3], Integer.valueOf(objeto[4]));
                agenda.append(contactoAux);
                linea = inBuffer.readLine();//leo una linea del fichero y lo guardo
            }

            System.out.println(agenda);
        } catch (IOException ex) {//casos si el fichero no existe, esta corrupto, etc.

            System.out.println("Excepcion: " + ex.getMessage());
        } finally {//accion que se hace al final
            if (inBuffer != null) {
                try {
                    inBuffer.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

    }//end main

}//end class

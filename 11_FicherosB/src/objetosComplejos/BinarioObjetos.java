package objetosComplejos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class BinarioObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio[] arraySocios = new Socio[4];

        arraySocios[0] = new Socio("1", "Pepe");
        arraySocios[1] = new Socio("2", "Ana");
        arraySocios[2] = new Socio("3", "Silvia");
        arraySocios[3] = new Socio("4", "Cris");

        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {

            salida.writeObject(arraySocios);

        } catch (IOException ex) {
            System.out.println(ex);
        }

        Socio[] arrayRecuperado= new Socio[0];
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("socios.dat"))) {

            arrayRecuperado= (Socio[]) entrada.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
        System.out.println(Arrays.toString(arrayRecuperado));

    }//end main

}//end class

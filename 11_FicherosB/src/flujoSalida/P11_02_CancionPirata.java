package flujoSalida;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P11_02_CancionPirata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String estrofa = "Con diez cañones por banda, \n "
                + "viento en popa a toda vela, \n"
                + "no corta el mar, sino vuela, \n"
                + "un velero bergatin.";

        try (ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("cancionPirata.dat"))){
            
           oos.writeObject(estrofa);

            System.out.println("Estrofa escrita con existo en binario.");
           
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }//end main

}//end class

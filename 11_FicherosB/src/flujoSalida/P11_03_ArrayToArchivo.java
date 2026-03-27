package flujoSalida;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P11_03_ArrayToArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] arrayDouble = {2.1, 3.2, 4, 4.7};

        System.out.println(Arrays.toString(arrayDouble));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("arrayDouble.dat"))) {
            
            
            out.writeObject(arrayDouble);
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//end main

}//end class

package flujoEntrada;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P11_05_LeerArrayDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("arrayDouble.dat"))) {
            //readObject siempre devuelve un objeto Object, hay que hcaer el casting por fuerza
            double[] arrayDouble = (double[]) in.readObject();
            
            System.out.println(Arrays.toString(arrayDouble));
            
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch(ClassNotFoundException ex){
            System.out.println(ex);
        }

    }//end main

}//end class

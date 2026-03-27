package flujoSalida;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class P11_01_EscribirEnteroTryResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        ObjectOutputStream flujoOutput= null;
        
        try{
            
            flujoOutput = new ObjectOutputStream(
                    new FileOutputStream("datos.dat"));
            for(int n: t){//bucle for each
                flujoOutput.writeInt(n);
            }
            
            System.out.println("Datos guardados con exito en datos.dat");
            
        }catch(IOException ex){
            System.out.println("Error al escribir en el fichero: " + ex.getMessage());
        }//reviar

    }//end main

}//end class

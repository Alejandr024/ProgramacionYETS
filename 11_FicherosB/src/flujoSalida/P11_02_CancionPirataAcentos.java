package flujoSalida;

import java.io.*;
/**
 *
 * @author jvega
 */
public class P11_02_CancionPirataAcentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String estrofa = "Con diez cañones por banda, \n"
                + "viento en popa a toda vela, \n"
                + "no corta el mar, sino vuela \n"
                + "un velero bergantín.";
        try (OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("cancionPirata.txt"), "UTF-8")) {
            writer.write(estrofa);
            System.out.println("Estrofa escrito con exito.");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//end main
    
}//end class
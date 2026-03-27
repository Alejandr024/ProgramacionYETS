
package prueba5;

/**
 *
 * @author Administrador
 */
public class CopiaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] meses = new int[12];
        for (int i = 0; i < meses.length; i++) {
            meses[i] = i+1;
        }
    
        // Proceso de copia de un array
        // Defino un array nuevo con la misma dimension que el anterior
        int[] mesesBackup = new int[meses.length];
           for (int i = 0; i < mesesBackup.length; i++) {
               System.out.println(mesesBackup[i]);
               mesesBackup[i] = meses[i];
        }

        //compruebo que se ha hecho la copia bien
        for (int i = 0; i < mesesBackup.length; i++) {
            System.out.println(mesesBackup[i]);

        }

        
}

}
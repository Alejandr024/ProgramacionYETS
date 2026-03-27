package ejercicioChatiGpt;

import java.util.Comparator;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class CompararApellidos implements Comparator<EstudianteAvanzado> {

    @Override
    public int compare(EstudianteAvanzado o1, EstudianteAvanzado o2) {
        int resultado = o1.getApellido().compareTo(o2.getApellido());

        if (resultado == 0) {
            return o1.getNombre().compareTo(o2.getNombre());
        }

        return resultado;
    }

}//end class

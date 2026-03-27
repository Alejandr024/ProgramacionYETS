package simulacro;

import java.util.Comparator;
import java.util.Arrays;

/**
 *
 * @author jvega
 */
public class Main_instituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alumno alumno = new Alumno("Juan", "Vega", "IES Las Galletas", "DAW");
        //System.out.println(alumno);

        System.out.println("Introduzco un alumno de primero:");
        AlumnoPrimero pedro = new AlumnoPrimero("Pedro", "Beltrán", "IES Las Galletas", "DAW");

        System.out.println("Lo matriculo de 4 modulos: [PRO, ETS, LNT, FOL] y luego llamo a mostrarModulos():");
        pedro.addModulo("PRO");
        pedro.addModulo("ETS");
        pedro.addModulo("LNT");
        pedro.addModulo("FOL");
        System.out.print("\t");
        System.out.print(pedro);
        System.out.print("\t");
        pedro.mostrarModulos();
        System.out.println();

    }

}

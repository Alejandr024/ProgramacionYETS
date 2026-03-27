package ejercicioChatiGpt;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class MainChati {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteAvanzado e1 = new EstudianteAvanzado("Ana", "Lopez", 21, 5, "Programacion");
        EstudianteAvanzado e2 = new EstudianteAvanzado("Carlos", "Martinez", 23, 3, "Bases de Datos");
        EstudianteAvanzado e3 = new EstudianteAvanzado("Laura", "Garcia", 20, 7, "Entornos de Desarrollo");

        Tutor tutor = new Tutor("Pedro");

        tutor.addEstudiante(e1);
        tutor.addEstudiante(e3);
        tutor.addEstudiante(e2);

        Arrays.sort(tutor.estudiantes);

        System.out.println("Sort sin apellidos");
        tutor.mostrarEstudiantes();

        System.out.println("Sort con apellidos");
        Arrays.sort(tutor.estudiantes, new CompararApellidos());

        tutor.mostrarEstudiantes();

    }//end main

}//end class

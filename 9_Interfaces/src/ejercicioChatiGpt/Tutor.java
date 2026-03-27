package ejercicioChatiGpt;

import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Tutor {

    String nombre;
    EstudianteAvanzado[] estudiantes;

    public Tutor(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new EstudianteAvanzado[0];
    }

    public Tutor(String nombre, EstudianteAvanzado[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(EstudianteAvanzado e) {

        EstudianteAvanzado[] arrayAux = Arrays.copyOf(estudiantes, estudiantes.length + 1);

        arrayAux[arrayAux.length - 1] = e;
        estudiantes = arrayAux;
        System.out.println("El alumno " + e.getNombre() + " ha sido agregado.");

    }

    public void mostrarEstudiantes() {
        System.out.println("Nombre\tApellido\tEdad\tModulos");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].getNombre() + "\t" + estudiantes[i].getApellido()
                    + "\t" + estudiantes[i].getEdad() + "\t" + estudiantes[i].getModulosMatriculados());
        }
    }

}//end class

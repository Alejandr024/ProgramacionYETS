package ejercicioChatiGpt;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class EstudianteAvanzado extends Estudiante implements Participante, Comparable<EstudianteAvanzado> {

    private int modulosMatriculados;
    private String curso;

    public EstudianteAvanzado(String nombre, String apellido, int edad, int modulosMatriculados, String curso) {
        super(nombre, apellido, edad);
        this.modulosMatriculados = modulosMatriculados;
        this.curso = curso;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + getNombre() + " " + getApellido() + " y estoy matriculado/a en el curso de " + curso + ".");
    }

    @Override
    public void entregrarActividad(String actividad) {
        System.out.println(getNombre() + " ha entregado la actividad de " + actividad + ".");

    }

    @Override
    public int compareTo(EstudianteAvanzado o) {
        return getModulosMatriculados() - o.getModulosMatriculados(); // para ser de mayor a menor seria "otro.valor - this.valor;".
    }

    /**
     * @return the modulosMatriculados
     */
    public int getModulosMatriculados() {
        return modulosMatriculados;
    }

}//end class

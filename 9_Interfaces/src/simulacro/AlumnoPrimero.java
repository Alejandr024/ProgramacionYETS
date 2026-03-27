package simulacro;

import java.util.Arrays;

public class AlumnoPrimero extends Alumno {

    private String[] modulos;

    private int curso;

    public AlumnoPrimero(String nombre, String apellido, String instituto, String ciclo) {
        super(nombre, apellido, instituto, ciclo);
        curso = 1;
        modulos = new String[0];
    }

    public void addModulo(String modulo) {
        String[] arrayAux = Arrays.copyOf(getModulos(), getModulos().length + 1);

        arrayAux[arrayAux.length - 1] = modulo;
        modulos = arrayAux;
        System.out.println("El modulo " + modulo + " ha sido agregado.");
    }

    public void mostrarModulos() {
        System.out.println("Modulos matriculados del alumno de " + curso + "ºDAW " + getNombre() + " " + getApellido() + ": " + Arrays.toString(getModulos()) + ".");
    }

    public void superarModulo(String modulo) {
        int indice = buscar(modulo);
        String[] aux = new String[modulos.length - 1];
        if (indice >= 0) {
            for (int i = 0, j = 0; i < modulos.length; i++) {
                if (i != indice) {
                    aux[j] = modulos[i];
                    j++;
                }
            }
            System.out.println("Modulo eliminado");
        }
    }

    int buscar(String modulo) {
        int indice = -1;
        for (int i = 0; i < getModulos().length && indice == -1; i++) {
            if (getModulos()[i].equals(modulo)) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            System.out.println("No estas matriculado en el modulo " + modulo);
        }
        return indice;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("(curso: %d)", curso);
    }

    /**
     * @return the modulos
     */
    public String[] getModulos() {
        return modulos;
    }

}//end class

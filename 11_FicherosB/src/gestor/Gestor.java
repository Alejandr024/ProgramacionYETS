package gestor;

import java.io.Serializable;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Gestor implements Serializable{

    public String nombre;
    private String tlf;
    double importeMax;

    public Gestor(String nombre, String tlf, double importeMax) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMax = importeMax;
    }

    public String toString() {
        return String.format("Nombre: %s \tDNI:  %s \tSaldo: %f ", nombre, tlf, importeMax);
    }
}//end class
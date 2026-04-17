package ejericicoPreSimulacro;

import java.io.Serializable;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Coche implements Serializable{
    private String marca;
    private String model;
    private int year;
    private double velocidadMaxima;

    public Coche(String marca, String model, int year, double velocidadMaxima) {
        this.marca = marca;
        this.model = model;
        this.year = year;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    @Override
    public String toString() {
        return "\t" + marca + " " + model + " (" + year + ") - Velocidad Maxima: " + velocidadMaxima + " km/h";
    }
    
    
}//end class
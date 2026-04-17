package ejericicoPreSimulacro;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Concesionario implements Serializable{
    private String nombreConcesionario;
    private String ciudad;
    private List<Coche> coches;
    
    public Concesionario(String nombreConcesionario, String ciudad) {
        this.nombreConcesionario= nombreConcesionario;
        this.ciudad= ciudad;
        this.coches= new ArrayList<>();
        
    }
    
    public void appendCar(Coche coche){
        getCoches().add(coche);
    }
    
    public void mostrarCoches() {
        System.out.println("Concesionario: " + getNombreConcesionario() + " - Ciudad: " + getCiudad());
        for (Coche coche : getCoches()) {
            System.out.println(coche);
        }
        
     
    }

    /**
     * @return the nombreConcesionario
     */
    public String getNombreConcesionario() {
        return nombreConcesionario;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @return the coches
     */
    public List<Coche> getCoches() {
        return coches;
    }
    
}//end class
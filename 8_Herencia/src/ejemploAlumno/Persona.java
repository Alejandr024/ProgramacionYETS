/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploAlumno;

/**
 *
 * @author Daw1
 */
public class Persona {
    String nombre;
    int nif;

    public Persona(String nombre, int nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    
    
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nNIF: " + nif;
    }
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploAbstracta;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public abstract class Persona implements Comer{
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    
    
}

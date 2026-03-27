/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progenitor;

/**
 *
 * @author Daw1
 */
public class Hijo extends Progenitor{
    private int edad;
    String amigo;

    public Hijo( String nombre, String apellido1, String apellido2) {
        super(nombre, apellido1, apellido2);
        this.edad = 0;
        this.amigo = "Sin amigos";
    }
    
    public Hijo( String nombre, String apellido1, String apellido2, int edad) {
        super(nombre, apellido1, apellido2);
        this.edad = edad;
        this.amigo = "Sin amigos";
    }

    
    public void cumplir(){
        edad++;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Edad:  " + edad + ", Mejor amigo: " + amigo;
    }
    
    
    
    
    
    
    
    
}//end class
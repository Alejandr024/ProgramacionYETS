/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Daw1
 */
public class Oviparo extends Animal {
    boolean isVuela;
    boolean isPluma;

    public Oviparo(boolean isVuela, boolean isPluma, String nombre, int edad) {
        super(nombre, edad);
        this.isVuela = isVuela;
        this.isPluma = isPluma;
    }
    
    
}

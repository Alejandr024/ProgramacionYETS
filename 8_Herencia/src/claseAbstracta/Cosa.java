/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseAbstracta;

/**
 *
 * @author Daw1
 */
public class Cosa  extends Abstracto{
    
    String nombre;
    
    public Cosa(String nombre){
        this.nombre= nombre;
    }
    
    @Override
     public String getNombre(){
         return nombre;
     }
    
}

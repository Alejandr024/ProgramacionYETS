/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listado;

/**
 *
 * @author Daw1
 */
public class Individuo implements Cloneable{
    
    String nombre;
    int ID;
    String colorPelo;

    public Individuo(String nombre, int ID, String colorPelo) {
        this.nombre = nombre;
        this.ID = ID;
        this.colorPelo = colorPelo;
    }
    
    @Override
    public Individuo clone(){
        return new Individuo(this.nombre, this.ID, this.colorPelo);
    }
    
    public boolean equals(Individuo individuo){

     return (this.nombre.equals(individuo.nombre) && this.ID == ID);
    }
    
    @Override
    public String toString() {
        return "Individuo{" + "nombre=" + nombre + ", ID=" + ID + ", colorPelo=" + colorPelo + '}';
    }
    
    
    
}//end class
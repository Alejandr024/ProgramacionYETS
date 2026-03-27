/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Daw1
 */
public class Perro extends Mamifero {
    private String raza;
    private boolean ladra;

    public Perro(String raza, boolean ladra, String pelaje, int patas, String nombre, int edad) {
        super(pelaje, patas, nombre, edad);
        this.raza = raza;
        this.ladra = ladra;
    }
    
    
    public void ladrad(){
        if(ladra){
            System.out.println("El perro ladra.");
        }else{
            System.out.println("El perro no ladra.");
        }
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the ladra
     */
    public boolean isLadra() {
        return ladra;
    }

    /**
     * @param ladra the ladra to set
     */
    public void setLadra(boolean ladra) {
        this.ladra = ladra;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroes;

/**
 *
 * @author Daw1
 */
public class Marvel extends Superheroe{


    public enum Universe{MARVELMAIN,MARVELAGE,MARVELUK,MARVELEPIC};

    
    private Universe universo; 
   
    boolean vengador;
    
    public Marvel(String nombre, String comicTipo, int fuerza, String idSecretra, boolean vengador){
        super(nombre, comicTipo, fuerza, idSecretra);
        this.vengador= vengador;
    }
    
    public boolean isVengador(){
        System.out.print("Es un vengador? ");
        return vengador;
    }

    public Universe getUniverso() {
        return universo;
    }
    
    
    
    
    
    
}

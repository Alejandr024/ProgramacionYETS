/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba6;

/**
 *
 * @author Daw1
 */
public class PalabraInvertida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text= "Hola";
        
        String invertido="";
        
        for(int i=text.length(); i>0;i--){
            invertido+=text.charAt(i-1);
        }
        
        System.out.println(invertido);
    }//end main
}//end class
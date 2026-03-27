/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploAbstracta;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno pepe= new Alumno("Juan","Vega","Beltran");
       
        System.out.println(pepe.tipoDieta("melon"));
       
        Dieta.pedir();
    }//end main
    
}//end class
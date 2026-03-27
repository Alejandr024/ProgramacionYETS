/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenNatural;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Alejandro <alej3839@gmail.com>
 */
public class MainAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alumno pepe= new Alumno("Pepe","Villuela",50);
        Alumno magoPop= new Alumno("Mago","Pop",30);
        Alumno lola= new Alumno("Lola","Directora",50);
        Alumno pepito= new Alumno("Pepito","Villuela",67);
        Alumno pepote= new Alumno("Pepote","Villuela",20);
        
        Alumno[] arrayAlumnos= {pepe, magoPop, lola, pepito,pepote};
        
        Comparator<Alumno> porNombre= Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getEdad);
        
        Arrays.sort(arrayAlumnos, porNombre);
        
        mostrar(arrayAlumnos);
        
    }//end main
    
    
    static void mostrar(Alumno[] arrayAlumnos){
        System.out.println("Nombre   Apellido    Edad");
        for(int i=0; i<arrayAlumnos.length; i++){
            System.out.println(arrayAlumnos[i]);
        }
    }
      
    
}//end class
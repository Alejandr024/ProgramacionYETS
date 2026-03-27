/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progenitor;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class Progenitor {
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Progenitor(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    
    
    public static Hijo reproducir(Progenitor padre, Progenitor madre){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Introduce el nombre de tu hijo: ");
        
        String nombreHijo= sc.nextLine();
        
        
        Hijo hijo= new Hijo(nombreHijo, padre.apellido1, madre.apellido1);
                
        System.out.println("Su hijo se llama: ");
        
        return hijo;
    }
    
    public Hijo clone(){
        
        return new Hijo(nombre, apellido1, apellido2);
    }
    

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s", nombre, apellido1, apellido2);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    
    
}

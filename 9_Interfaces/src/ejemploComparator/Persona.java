/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploComparator;

//import static java.lang.CharSequence.compare;


/**
 *
 * @author Daw1
 */
public class Persona implements Comparable{
    String nombre;
    private String apellido1;
    private String apellido2;

    public Persona(String nombre, String apellido, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido;
        this.apellido2 = apellido2;
    }

    @Override
    public int compareTo(Object o){
       return  getApellido1().compareTo(((Persona) o).getApellido1());
    }

    @Override
    public String toString() {
        return nombre + " " + getApellido1() + " " + getApellido2() + "\n";
    }   

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }
    
}


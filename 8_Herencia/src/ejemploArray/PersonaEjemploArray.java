/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploArray;

//import static java.lang.CharSequence.compare;


/**
 *
 * @author Daw1
 */
public class PersonaEjemploArray implements Comparable{
    String nombre;
    String apellido1;
    String apellido2;

    public PersonaEjemploArray(String nombre, String apellido, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido;
        this.apellido2 = apellido2;
    }

    @Override
    public int compareTo(Object o) {
       return  nombre.compareTo(((PersonaEjemploArray) o).nombre);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido1 + " " + apellido2 + "\n";
    }   
    
}


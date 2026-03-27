/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploAlumno;

/**
 *
 * @author Daw1
 */
public class Alumno extends Persona {
    String curso;

    public Alumno(String curso, String nombre, int nif) {
        super(nombre, nif);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + "\nNIF: " + nif + "\nCurso:" + curso;
    }
            
            
          
    
}

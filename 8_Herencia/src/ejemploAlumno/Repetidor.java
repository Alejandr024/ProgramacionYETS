/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploAlumno;

/**
 *
 * @author Daw1
 */
public class Repetidor extends Alumno {
    int cursosRepetidos;

    public Repetidor(int cursosRepetidos, String curso, String nombre, int nif) {
        super(curso, nombre, nif);
        this.cursosRepetidos = cursosRepetidos;
    }

    @Override
    public String toString() {
        return "Repetidor: " + nombre + "\nNIF: " + nif + "\nCurso: "+ curso+ "\nCursos repetidos: "+ cursosRepetidos;
    }
    
    
}

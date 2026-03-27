/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploAbstracta;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Alumno extends Persona implements Dieta {

    private boolean adolescente;

    public Alumno(String nombre, String apellido1, String apellido2) {
        super(nombre, apellido1, apellido2);
        this.adolescente = false;
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo");
    }

    @Override
    public boolean alergias(String alimento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

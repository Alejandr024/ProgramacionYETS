/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Daw1
 */
public class PersonaAnimal extends Mamifero{
    private String dni;
    private String telefono;

    public PersonaAnimal(String dni, String telefono, String pelaje, int patas, String nombre, int edad) {
        super(pelaje, patas, nombre, edad);
        this.dni = dni;
        this.telefono = telefono;
    }
    
    public void enviarSMS(){
        System.out.println("EL usuario de telefono " + telefono + " envio un SMS.");
    }
    

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}

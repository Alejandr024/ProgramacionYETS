/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroPersonas;

/**
 *
 * @author alej3
 */
public class PersonaRegistro {
    private String apellido;
    int dni;
    private String ciudadNacimiento;
    private String ciudadEmpadronamiento;

    public PersonaRegistro(String apellido, int dni, String ciudadNacimiento) {
        this.apellido = apellido;
        this.dni = dni;
        this.ciudadNacimiento = ciudadNacimiento;
    }

    
    public boolean equals(PersonaRegistro individuo){
        return (this.apellido.equals(individuo.apellido) && this.dni == individuo.dni && this.getCiudadNacimiento().equals(getCiudadNacimiento()));
    }
    
    
    
    @Override
    public String toString() {
        return String.format("%-12s %-10d %-20s %-20s",
                         apellido, dni, getCiudadNacimiento(), getCiudadEmpadronamiento());    }

    /**
     * @return the ciudadNacimiento
     */
    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    /**
     * @param ciudadNacimiento the ciudadNacimiento to set
     */
    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    /**
     * @return the ciudadEmpadronamiento
     */
    public String getCiudadEmpadronamiento() {
        return ciudadEmpadronamiento;
    }

    /**
     * @param ciudadEmpadronamiento the ciudadEmpadronamiento to set
     */
    public void setCiudadEmpadronamiento(String ciudadEmpadronamiento) {
        this.ciudadEmpadronamiento = ciudadEmpadronamiento;
    }
}

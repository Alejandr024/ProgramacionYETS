package empresa;

import java.sql.Date;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salarioBase;
    private Date fechaContratacion;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salarioBase, Date fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.fechaContratacion = fechaContratacion;
    }

    // Constructor sin ID
    public Empleado(String nombre, String puesto, double salarioBase, Date fechaContratacion) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.fechaContratacion = fechaContratacion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre
                + "', puesto='" + puesto + "', salario=" + salarioBase + "}";
    }
}//end class
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Daw1
 */
public class Autor {
    private String nombre;
    private String apellido;
    private int librosPublicados;

    public Autor(String nombre, String apellido, int librosPublicados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.librosPublicados = librosPublicados;
    }

    public String getNombreCompleto() {
        return getNombre() + " " + getApellido();
    }

    public int getLibrosPublicados() {
        return librosPublicados;
    }

    public void incrementaObra() {
        librosPublicados++;
    }

    public double calcularPromedioLibrosPorYear(int year) {
        if (year <= 0) return 0;
        return (double) getLibrosPublicados() / year;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }
    
    
    
}//End class
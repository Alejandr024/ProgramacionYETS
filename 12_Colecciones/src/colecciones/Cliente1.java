package colecciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Cliente1 implements Comparable<Cliente1> {

    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;

    Cliente1(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formatoFechas
                = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatoFechas);
    }

    int edad() {
        return (int) getFechaNacimiento().until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public boolean equals(Object ob) {
        return getDni().equals(((Cliente1) ob).getDni());
    }

    @Override
    public int compareTo(Cliente1 otro) {
        return getDni().compareTo(otro.getDni());
    }

    @Override
    public String toString() {
        return "DNI: " + getDni() + " Nombre: " + getNombre() + " Edad: " + edad() + "\n";
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the fechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}

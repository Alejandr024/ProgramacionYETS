package instituto;

import java.sql.Date;


/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Alumno {

    private int num;
    private String nombre;
    private Date fNacimiento;
    private double notaMedia;
    private String curso;

    // Constructor completo
    public Alumno(int num, String nombre, Date fNacimiento, double notaMedia, String curso) {
        this.num = num;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.notaMedia = notaMedia;
        this.curso = curso;
    }

    // Constructor sin ID (para inserciones nuevas)
    public Alumno(String nombre, Date fNacimiento, double notaMedia, String curso) {
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.notaMedia = notaMedia;
        this.curso = curso;
    }

    // Getters y Setters
    public int getNum() {
        return num;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{num=" + num + ", nombre='" + nombre
                + "', media=" + notaMedia + ", curso='" + curso + "'}";
    }
}

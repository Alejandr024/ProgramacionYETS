package simulacro;

import java.util.Arrays;

/**
 *
 * @author Alejandro <alej3839@gmail.com>
 */
public class AlumnoSegundo extends Alumno implements FCT{

    private int curso;
    private String[] modulos;
    private String empresa;
    
    
    public AlumnoSegundo(String nombre, String apellido, String instituto, String ciclo) {
        super(nombre, apellido, instituto, ciclo);
        this.curso=2;
        this.modulos= new String[0];
    }
    
    
    
    public AlumnoSegundo(AlumnoPrimero alumno1) {
        super(alumno1.getNombre(), alumno1.getApellido(), alumno1.instituto, alumno1.ciclo);
        this.curso=2;
        this.modulos= Arrays.copyOf(alumno1.getModulos(),alumno1.getModulos().length);
    }
    
    
    public void mostrarModulos() {
        System.out.println("Modulos matriculados del alumno de " + curso + "ºDAW " + getNombre() + " " + getApellido() + ": " + Arrays.toString(getModulos()) + ".");
    } 
    
    @Override
    public void asignarEmpresa(AlumnoSegundo alumno, String empresa) {
        System.out.println(getNombre() + " " + getApellido() + " no tiene privilegios para asignar empresas, contacte con su tutor.");
    }

    @Override
    public String obtenerEmpresa(AlumnoSegundo alumno) {
        System.out.println("La empresa de " + alumno.getNombre() + " es " + alumno.getEmpresa() + ".");
        String text= alumno.getNombre() + " " + alumno.getApellido() + " no tiene privilegios para asignar empresas, contacte con su tutor.";
        return text;
    }

    @Override
    public void setInstituto(String instituto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getDistanciaCentro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setDistanciaCentro(double distancia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the curso
     */
    public int getCurso() {
        return curso;
    }

    /**
     * @return the modulos
     */
    public String[] getModulos() {
        return modulos;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }


    @Override
    public String toString() {
        return super.toString();
    }
    
    public int compareTo(Object o){
       return  ((AlumnoSegundo)o).modulos.length - modulos.length;
    }
    
    
}//end class
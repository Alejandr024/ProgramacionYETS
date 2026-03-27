/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro;

import java.util.Arrays;

/**
 *
 * @author Alejandro <alej3839@gmail.com>
 */
public class Tutor implements FCT{

    private String nombre;
    private String apellido;
    private String instituto;
    private String ciclo;
    private AlumnoSegundo[] alumnos;
    private String modulo;
    private double distancia;
    private String[] empresas;

    public Tutor(String nombre, String apellido, String instituto, String ciclo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.instituto = instituto;
        this.ciclo = ciclo;
        this.alumnos = new AlumnoSegundo[0];
        this.modulo = modulo;
        this.distancia = 0;
        this.empresas= new String[0];
    }
    
    
    int buscar(AlumnoSegundo alumno) {
        int indice = -1;
        for (int i = 0; i < alumnos.length && indice == -1; i++) {
            if (alumnos[i].equals(alumno)) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            System.out.println("Este alumno no esta matriculado.");
        }
        return indice;
    }
    
    
    public void addAlumno(AlumnoSegundo alumno) {
        AlumnoSegundo[] arrayAux = Arrays.copyOf(alumnos, alumnos.length + 1);

        arrayAux[arrayAux.length - 1] = alumno;
        alumnos = arrayAux;
        System.out.println("El alumno " + alumno + " ha sido agregado.");
        empresas= Arrays.copyOf(empresas, empresas.length+1);
    }
       
    public void mostrarAlmnos() {
        System.out.println("Alumno de 2 de " + nombre + apellido + " por orden de insercion: ");
        
        for(AlumnoSegundo alumno: alumnos){
            System.out.println(alumno.getNombre() + alumno.getApellido() + Arrays.toString(alumno.getModulos()));
        }
    }
    
    @Override
    public void asignarEmpresa(AlumnoSegundo alumno, String empresa) {
        empresas[buscar(alumno)]=empresa;
    }

    @Override
    public String obtenerEmpresa(AlumnoSegundo alumno) {
        int n= buscar(alumno);
        
        if(n>=0 && empresas[n]!=null){
            return "La empresa asignada al alumno " + alumno.getNombre() +alumno.getApellido() + " es: " + empresas[n] + ".";
        }
        
        return "No esta matriculado mi colegoncio";
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
    
    
    
    
}//end class
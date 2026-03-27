package ejemplosInterfaces;

/**
 *
 * @author Daw1
 */
public class Gaviota extends Aves implements Volador, Repostar{
    String nombre;
    int edad;
    boolean enferma;

    public Gaviota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.enferma = true;
    }

    @Override
    public boolean vuela() {
        return enferma;
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saludar(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public void repostar(int combustible) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void repostar(String combustible) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public void altura(int altura){
        System.out.println("Soy un ave y estoy volando a la altura de " + altura + " metros.");
    }
}

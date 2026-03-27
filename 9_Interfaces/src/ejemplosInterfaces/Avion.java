package ejemplosInterfaces;

/**
 *
 * @author Daw1
 */
public class Avion implements Volador, Repostar {
    
    String modelo;
    int fecha;
    boolean isbroken;

    public Avion(String modelo, int fecha) {
        this.modelo = modelo;
        this.fecha = fecha;
        this.isbroken= true;
    }

    @Override
    public boolean vuela() {
        return isbroken;
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


  
    
    
    
    
}//end class
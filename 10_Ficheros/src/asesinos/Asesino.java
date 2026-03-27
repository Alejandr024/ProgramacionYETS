
package asesinos;

import java.util.Random;

/**
 *
 * @author jvega
 */
public class Asesino {
    private String nombre;
    private int inteligencia;
    private int suerte;
    private boolean isLicencia;
    private String[][] arrayCombates; 
    private static Random rnd = new Random();

    public Asesino(String nombre, int inteligencia, int suerte, boolean isLicencia) {
        this.nombre = nombre;
        this.inteligencia = inteligencia;
        this.suerte = suerte;
        this.isLicencia = isLicencia;
        this.arrayCombates = new String[0][3];
        
    }
    
     // Constructor sobrecargado: solo nombre, resto aleatorio
    public Asesino(String nombre) {
        this.nombre = nombre;
        this.inteligencia = rnd.nextInt(20) + 1; // 1-20
        this.suerte = rnd.nextInt(10) + 1;       // 1-10
        this.isLicencia = rnd.nextBoolean();
        this.arrayCombates= new String[0][3];
    }
    
    
    public void registrarCombate(String fecha, String ganador, String perdedor) {
        String[][] nuevoArray = new String[arrayCombates.length + 1][3];
        // copiar filas existentes
        for (int i = 0; i < arrayCombates.length; i++) {
            for(int j=0; j<3;j++){
                 nuevoArray[i][j] = arrayCombates[i][j];
            }
        }
        
        // añadir la nueva fila al final
        nuevoArray[nuevoArray.length - 1][0] = fecha;
        nuevoArray[nuevoArray.length - 1][1] = ganador;
        nuevoArray[nuevoArray.length - 1][2] = perdedor;

        arrayCombates = nuevoArray;
    }

    public void mostrarCombates() {
        if (arrayCombates.length == 0) {
            System.out.println(getNombre() + " no ha realizado ningun combate aun.");
        } else {
            System.out.println("Resultados de los combates realizados por " + getNombre());
            for (int i = 0; i < arrayCombates.length; i++) {
                String fecha = arrayCombates[i][0];
                String ganador = arrayCombates[i][1];
                String perdedor = arrayCombates[i][2];
                System.out.printf("%-10s -> %-15s gana a %-15s\n", fecha, ganador, perdedor);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%-20s %-12d %-8d %-8s", getNombre(), getInteligencia(), getSuerte(), (isIsLicencia() ? "SI" : "NO"));
    }
    
    public int calcularPuntuacionCombate() {
        int bonusLicencia = isIsLicencia() ? 5 : 0;
        int random = rnd.nextInt(10) + 1; // 1-10
        return getInteligencia() + getSuerte() + bonusLicencia + random;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the inteligencia
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * @return the suerte
     */
    public int getSuerte() {
        return suerte;
    }

    /**
     * @return the isLicencia
     */
    public boolean isIsLicencia() {
        return isLicencia;
    }
    
}
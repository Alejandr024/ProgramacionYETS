package heroes;

import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class DC extends Superheroe{
    
    public enum Personalidad{VALIENTE,JUSTICIERO,INTELIGENTE,CARISMATICO,SOLITARIO};
    
    private Personalidad personalidad;
    
    private String ciudad;
    
    public DC(String nombre, String comicTipo, int fuerza, String idSecretra, String ciudad) {
        super(nombre, comicTipo, fuerza, idSecretra);
    }
    
    
    public void detiene(String villano, String ciudad){
        String[] arrayAux = Arrays.copyOf(arrayVillanos, arrayVillanos.length+1);
        arrayAux[arrayAux.length-1]= villano;
        
        String[] arrayCiudad= Arrays.copyOf(arrayVillanos, arrayVillanos.length+1);
        arrayAux[arrayAux.length-1]= ciudad;
        
    }

    /**
     * @return the personalidad
     */
    public Personalidad getPersonalidad() {
        return personalidad;
    }

    /**
     * @param personalidad the personalidad to set
     */
    public void setPersonalidad(Personalidad personalidad) {
        this.personalidad = personalidad;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}//end class
package examenSteam20260312;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez 
 * hereda de clase Steam y se implementa
 * ContenidoMultimedia y Ejecutable, se utilizaran mas adelante.
 */
public class DLC extends Steam implements ContenidoMultimedia, Ejecutable {

    /**
     * @return the juegoBase
     */
    public String getJuegoBase() {
        return juegoBase;
    }

    /**
     * @param esTemporada the esTemporada to set
     */
    public void setEsTemporada(boolean esTemporada) {
        this.esTemporada = esTemporada;
    }

    //crear variables
    private String juegoBase;
    private boolean esTemporada;

    //montar el constructor
    public DLC(String nombre, double precio, String juegoBase, boolean esTemporada) {
        super(nombre, precio);
        this.juegoBase = juegoBase;
        this.esTemporada = esTemporada;
    }

    //se monta el metodo MOstrarDetalles (muestra detalles del DLC) sobreescrito:
    @Override
    public void mostrarDetalles() {
        System.out.println(getNombre() + " (juego base):" + getJuegoBase() + ". Es temporada para decargarlo? " + esTemporada + ".");
    }

    // se monta el metodo iniciar(arranca la descargar del DLC del juego base) sobreescrito:
    @Override
    public void iniciar() {
        System.out.println("Iniciando contenido descargable para " + getJuegoBase() + "...");
    }

    //se monta el toStrign agregando el super toStrign de la clase Steam
    @Override
    public String toString() {
        return super.toString() + "  |  DLC: " + getNombre() + "  |  (Temporada: " + esTemporada + ")";
    }

}//end class

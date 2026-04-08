package examenSteam20260312;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez Hereda de la clase Steam e implementa
 * ContenidoMultimedia que se usara mas adelantes
 */
public class Juego extends Steam implements ContenidoMultimedia {

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @return the espacioGB
     */
    public double getEspacioGB() {
        return espacioGB;
    }

    //creamos los atributos
    private String genero;
    private double espacioGB;

    //creamos el constructo, tanto de la clase Steam, como de esta clase.
    public Juego(String nombre, double precio, String genero, double espacioGB) {
        super(nombre, precio);
        this.genero = genero;
        this.espacioGB = espacioGB;
    }

    //agregamos el metodo mostrarDetalles (muestra detalles del juego) de la interfaz Contenido multimedia (la renombramos, importante)
    @Override
    public void mostrarDetalles() {
        System.out.println(getNombre() + " " + getGenero() + " - " + getEspacioGB() + ".");
    }

    // Creamos el toString sumando el super toString de la clase Steam.
    @Override
    public String toString() {

        return super.toString() + "  |  Juego: " + getGenero() + "  |  " + getEspacioGB();
    }

}//end class

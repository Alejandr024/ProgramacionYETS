package examenSteam20260312;

import java.util.Random;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez implementamos las interfaces
 * COntenidoMultimedia y COmparable, este ultimo para el orden natural
 */
public abstract class Steam implements ContenidoMultimedia, Comparable {
    //creamos los atributos

    private String nombre;
    private double precio;
    double horasJugadas;
    private int valoracion;
    Random rnd = new Random();

    //creamos el constructor, donde generara una valoracion aleatoria entre 0 y 100
    public Steam(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.valoracion = rnd.nextInt(100);//entre 0 y 100
    }

    //compramos los nombre para ordenarlos por orden alfabetico
    @Override
    public int compareTo(Object o) {
        Steam auxSteam = (Steam) o;
        int resultado = (Character.toLowerCase(this.getNombre().compareTo(auxSteam.getNombre())));

        return resultado;
    }

    //creamos el equals para comprobar si dos objetos son igual de nombre y precio
    public boolean equals(Steam s) {
        boolean igual = false;
        if (getNombre().equalsIgnoreCase(s.getNombre()) && getPrecio() == s.getPrecio()) {
            igual = true;
        }

        return igual;
    }

    //generamos el toString
    @Override
    public String toString() {
        return String.format("%-12s  |  Precio: %d  |  Val: %d", getNombre(), getPrecio(), getValoracion());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return the valoracion
     */
    public int getValoracion() {
        return valoracion;
    }

}//end class

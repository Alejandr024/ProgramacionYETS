package ejericiciosChati;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class ProductoElectronicos implements Comparable<ProductoElectronicos>{
    
    private Integer codigo;
    private String nombre;
    private String marca;
    private Double precio;

    public ProductoElectronicos(Integer codigo, String nombre, String marca, Double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public int compareTo(ProductoElectronicos o) {
        return this.getCodigo()-o.getCodigo();
        //Tambien se puede hacer de esta manera: Integer.compare(this.codigo, o.codigo);
    }
    
    public boolean equals(ProductoElectronicos producto) {
        boolean igual = false;

        if (this.getCodigo().equals(producto.getCodigo())) {
            igual = true;
        }

        return igual;
    }

    @Override
    public String toString() {
        return String.format("%-12d%-12s%-12s%.2f\n", getCodigo(), getNombre(), getMarca(), getPrecio());
    }

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
    
}//end class
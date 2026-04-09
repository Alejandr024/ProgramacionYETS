package  biblioteca;

public class Libro {
    private String titulo;
    private String isbn;
    private int paginas;
    private double precioBase;
    
    public Libro(String titulo, String isbn, int paginas, double precioBase) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
        this.precioBase = precioBase;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public int getPaginas() {
        return paginas;
    }
    
    public double getPrecioBase() {
        return precioBase;
    }
    
    public void incrementaPaginas(int x) {
        if (x > 0) {
            this.paginas += x;
        }
    }
    
    public void decrementaPaginas(int x) {
        if (x > 0 && this.paginas - x >= 0) {
            this.paginas -= x;
        }
    }
    
    public int calcularTiempoLectura(int minutosPorPagina) {
        if (minutosPorPagina <= 0) {
            return 0;
        }
        return this.paginas * minutosPorPagina;
    }
}

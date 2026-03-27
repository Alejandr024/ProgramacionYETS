package animal;

/**
 *
 * @author Daw1
 */
public class Mamifero extends Animal{
    private String pelaje;
    private int patas;

    public Mamifero(String pelaje, int patas, String nombre, int edad) {
        super(nombre, edad);
        this.pelaje = pelaje;
        this.patas = patas;
    }
    
    
    
    public void amamantar(){
        System.out.println("El " + getNombre() + " esta amamantando.");
    }

    @Override
    public String toString() {
        return super.toString() + "Mamifero{" + "pelaje=" + pelaje + ", patas=" + patas + '}';
    }
    
    @Override
    public void comer(){
        System.out.println("El mamifero esta comiendo.");
    }
    
    
    /**
     * @return the pelaje
     */
    public String getPelaje() {
        return pelaje;
    }

    /**
     * @param pelaje the pelaje to set
     */
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    /**
     * @return the patas
     */
    public int getPatas() {
        return patas;
    }

    /**
     * @param patas the patas to set
     */
    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    
    
}

package ejemploCompare;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Daw1
 */
public class Superheroe implements Comparable{
  
    private String nombre;
    String comicTipo;
    private int fuerza;
    String idSecreta;
    String[] arrayVillanos;
    String []arrayComic;

    public Superheroe(String nombre, String comicTipo, int fuerza, String idSecretra) {
        this.nombre = nombre;
        this.comicTipo = comicTipo;
        this.fuerza = fuerza;
        this.idSecreta = idSecretra;
        this.arrayVillanos= new String[0];
        this.arrayComic= new String[0];
    }
    
    
    public void presentarse(){
        System.out.println("Hola, soy " + nombre + " y pertenezco al comic de " + comicTipo + ".");
    }
    
    
    public void detiene(String villano, String comic){
        String[] arrayAux = Arrays.copyOf(arrayVillanos, arrayVillanos.length+1);
        arrayAux[arrayAux.length-1]= villano;
        arrayVillanos=arrayAux;
        
        String[] arrayAuxComic= Arrays.copyOf(arrayComic, arrayComic.length+1);
        arrayAuxComic[arrayAuxComic.length-1]= comic;
        arrayComic=arrayAuxComic;
    }
    
    public void revelaIdentidad(){
        System.out.println("El heroe " + nombre + " se llama " + idSecreta + ".");
    }
    
    public void mostrarDetenidos(){
            System.out.println("Nombre ");
            
            for(int i=0; i<arrayVillanos.length; i++){
                System.out.println(arrayVillanos[i] + "\n");
            }
    }
    
    
    public boolean isLibre(String villano){
        boolean libre=false;
        
        for(int i=0; i<arrayVillanos.length; i++){
            if(!arrayVillanos[i].equals(villano)){
                libre=true;
            }
        }
        System.out.println("El villano " + villano + " esta libre? " + libre + ".");
        return libre;
    }
    
     private int dado(){
        Random random = new Random();
        
        
        return random.nextInt(20) + 1;
    }
    
    
    
    public static void combate(Superheroe heroe1, Superheroe heroe2){
        int dado1= heroe1.dado();
        
        int dado2= heroe2.dado();
        
        if(heroe1.getFuerza() + dado1 > heroe2.getFuerza() + dado2){
            System.out.println("El heroe " + heroe1 + " gana a " + heroe2 + ".");
        }else if(heroe1.getFuerza() + dado1 < heroe2.getFuerza() + dado2){
            System.out.println("El heroe " + heroe2 + " gana a " + heroe1 + ".");
        }else{
            System.out.println("El heroe " + heroe1 + "y" + heroe2+ " quedaron en empate.");
        }
    }

    
    
    @Override
    public int compareTo(Object o){
        return ((Superheroe)o).fuerza - fuerza;
    }
    
    @Override
public String toString() {
    return String.format(
        "%-15s %-12s %-8s %-12s %-25s %-25s%n" +
        "%-15s %-12s %-8d %-12s %-25s %-25s",
        "Nombre", "Comic", "Fuerza", "IdSecreta", "Villanos", "ComicsVillanos",
        nombre, comicTipo, fuerza, idSecreta,
        Arrays.toString(arrayVillanos),
        Arrays.toString(arrayComic)
    );
}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the fuerza
     */
    public int getFuerza() {
        return fuerza;
    }
    
    
    
    
    
    
    
}//end class
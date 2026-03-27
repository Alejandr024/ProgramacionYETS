package jugador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Daw1
 */
public class Jugador {
    
    private String name;
    private int fuerza;
    private byte vida=3;
    private String[] ArrayCombates;

    public Jugador(String name, int fuerza, byte vida, String[] ArrayCombates) {
        this.name = name;
        this.fuerza = fuerza;
        this.vida = vida;
        this.ArrayCombates = ArrayCombates;
    }

    public Jugador(String name, int fuerza) {
        this.name = name;
        this.fuerza = fuerza;
        vida = 3;
        ArrayCombates=new String[0];
    }
    
    private static String obetenerFechaHoraActual(){
        LocalDateTime ahora= LocalDateTime.now();
        
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        
        return ahora.format(formato);
    }
    
    private int dado(){
        Random random = new Random();
        
        
        return random.nextInt(20) + 1;
    }
    
    
    
    public static void combate(Jugador uno, Jugador dos){
        String mensaje = Jugador .obetenerFechaHoraActual();
        int dado1= uno.dado();
        
        int dado2= dos.dado();
        
        if(uno.getFuerza() + dado1 > dos.getFuerza() + dado2){
            dos.vida -= 1;
            mensaje += ": " + uno.getName() + " gana a " + dos.getName() + ".";
        }else if(uno.getFuerza() + dado1 < dos.getFuerza() + dado2){
            uno.vida -= 1;
            mensaje += ": " + dos.getName() + " gana a " + uno.getName() + ".";
        }else{
            mensaje+= ": " + uno.getName() + " y " + dos.getName() + " quedaron empate.";
        }
        
        uno.ArrayCombates = uno.add(uno.getArrayCombates(), mensaje);
        
        dos.ArrayCombates = dos.add(dos.getArrayCombates(), mensaje);
        
        System.out.println("Hora del combate: " + mensaje);
    }
    
    private String[] add(String[] ArrayCombates, String mensaje){
        String[] arrayAux= new String[ArrayCombates.length +1];
        
        for(int i=0; i<ArrayCombates.length; i++){
            arrayAux[i]= ArrayCombates[i];
            
                    
            
        }
        arrayAux[arrayAux.length-1]= mensaje;
        
        return arrayAux;
    }

    
//    private void appendCombate(String mensaje){
//       ArrayCombates = Arrays.copyOf(ArrayCombates, ArrayCombates.length +1);
//       ArrayCombates[ArrayCombates.length-1]= mensaje;
//    } Este funciona tambien para agregar
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * @return the vida
     */
    public byte getVida() {
        return vida;
    }

    /**
     * @return the ArrayCombates
     */
    public String[] getArrayCombates() {
        return ArrayCombates;
    }
    
}//end class
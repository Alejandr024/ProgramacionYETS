package examen20260212Herencia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Agenda {
    int [] fechas;
    Contacto [] contactos;
    
    public Agenda(){
        this.fechas= new int [0];
        this.contactos= new Contacto[0];
    }
    
    public Agenda(Contacto[] contactos){
        this.contactos= contactos;
        this.fechas= new int [contactos.length];
        
        for(int i=0; i< fechas.length; i++){
            fechas[i]=obtenerFecha();
        }
    }
    
    public void append(Contacto contacto, int fecha){
        Contacto [] arrayAux= Arrays.copyOf(contactos, contactos.length+1);
        int[] arrayAuxFecha= Arrays.copyOf(fechas, fechas.length+1);
        
        arrayAux[arrayAux.length-1]= contacto;
        contactos=arrayAux;
        
        arrayAuxFecha[arrayAuxFecha.length-1]= fecha;
        fechas=arrayAuxFecha;
    }
    
    public void append(Contacto contacto){
        int fecha= obtenerFecha();
        
        append(contacto, fecha);
    }
    
    
    public void quitar( Contacto contacto){
        Contacto [] arrayAux= new Contacto [0];
        int[] arrayAuxfechas=new int[0];
        
        for(int i=0; i<contactos.length; i++){
            if(!contacto.equal(contactos[i])){
                arrayAux[i]= contactos[i];
                arrayAuxfechas[i]= fechas[i];
            }
        }
       contactos= arrayAux;
       fechas= arrayAuxfechas;
         
    }
    
    
    public static int obtenerFecha() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd");
        int fecha= Integer.parseInt(ahora.format(fmt));
        
        return fecha;
    }

    @Override
    public String toString() {
        return String.format("\t%-10s %-12s %-12s &-10s\n", "Fecha", "Nombre", "Apellido", "Telefono");
//        
//        for(int i=0; i<contactos.length; i++){
//            
//        }
    }
    
    
    
    
    
    
}//end class
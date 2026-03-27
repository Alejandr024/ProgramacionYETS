package registroPersonas;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author alej3
 */
public class Registro {
    
    PersonaRegistro[] listaPersonas;
    String ciudad;

    public Registro(String ciudad) {
        this.listaPersonas= new PersonaRegistro[0];
        this.ciudad= ciudad;
    }

    public Registro(PersonaRegistro[]listaPersona, String ciudad) {
        this.listaPersonas = listaPersona;
        this.ciudad = ciudad;
    }
    
    public PersonaRegistro incribirHijo(){
        Scanner sc= new Scanner(System.in, "windows-1252");
        Random r= new Random();
        
        
        System.out.print("Ingrese el apellido: ");
        
        String lastName= sc.nextLine();
        
//        String dniHijo="";
//        
//        for(int i=0; i<8;i++){
//            int numbe= r.nextInt(9);
//            dniHijo+=String.valueOf(numbe);
//        }
//        Este random funciona tambien.
//        int newDni= Integer.parseInt(dniHijo);
        
        int dniHijo = 100000000 + r.nextInt(900000000);
        
        PersonaRegistro hijoInscrito= new PersonaRegistro(lastName, dniHijo, this.ciudad);
        
        return hijoInscrito;
    }
    
    public void eliminar(PersonaRegistro p){
        
        PersonaRegistro[] arrayAux= new PersonaRegistro[0];
        
        for(int i=0; i<listaPersonas.length;i++){
            if(!listaPersonas[i].equals(p)){
                arrayAux= Arrays.copyOf(arrayAux, arrayAux.length+1);
                arrayAux[arrayAux.length-1]= listaPersonas[i];
            }
        }
        
        listaPersonas= arrayAux;
    }
    
    
    
    public void buscaCiudadNacimineto(String buscaCiudad){
        System.out.println("Gente que nacieron en " + buscaCiudad);
        
        
    }
    
    
    
    
}//end class
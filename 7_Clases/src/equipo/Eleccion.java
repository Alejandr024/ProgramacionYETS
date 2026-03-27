package equipo;
import java.util.Scanner;


/**
 *
 * @author Daw1
 */
public class Eleccion {
    Scanner sc= new Scanner(System.in);
    
    String entrada;
    
    int equipo;
    
    String posicion;
    
    void eleccion(){
        
        System.out.print("Ingrese su nombre de usuario: ");
        
        entrada=sc.nextLine();
        
        String usuario= entrada;
        
        System.out.print("Hola, bienvenido " + usuario +". Por favor, elija a su equipo: \n"
                + "1. Barça.\n"
                + "2. Real Madrid.\n"
                + "3. PSG.\n");
        
        equipo= sc.nextInt();
        
        
        switch(equipo){
            case 1:
                System.out.println("Has elegido al Barca.");
                System.out.print("Eliga su posicion: ");
                posicion= sc.nextLine();
                
                break;
            case 2:
                System.out.println("Has elegido al Madrid.");
                break;
            case 3:
                System.out.println("Has elegido al PSG.");
                break;
            default:
                System.out.println("No has elegido a ningún equipo.");
        }
        
        
        
    }
    
}

package prueba6;
import java.util.Scanner;
/**
 *
 * @author Daw1
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in, "windows-1252");
        
        String password, respuesta;
        
        System.out.print("Introduce la contaseña: ");
        password= sc.nextLine();
        
        System.out.printf("La contraseña tiene %d caracteres.\n", password.length());
        
        System.out.print("INtroduce tu respuetsa: ");
        
        respuesta= sc.nextLine();
        while(respuesta.length()!=password.length()){
            System.out.print("Error, tu respuesta no tiene la misma longitud.\nPor favor, vuelva a intentarlo: ");
            respuesta= sc.nextLine();     
        }
        
        while(!respuesta.equals(password)){
            String pista="";
            
            for(int i=0; i<password.length();i++){
                if(password.charAt(i)==respuesta.charAt(i)){
                    pista+=respuesta.charAt(i);
                }else{
                    pista+="*";
                }
            }
            System.out.print(pista + ". Sigue intendandolo.");
            respuesta= sc.nextLine();
        }
        
        System.out.println("Has acertado, Felicidades!");
    }//end main
    
}//end class
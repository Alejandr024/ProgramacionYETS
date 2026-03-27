package dni;

import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class Dni {
    
    private String dni;
    private char letter;
    
    public Dni(){
        this.dni=leer();
        this.letter= calculoDni(dni);
    }
    
    
    
    
    public Dni(String dni){
        this.dni=dni;
        letter=calculoDni(dni);
    }
    
    public String leer(){
        String dni="";
        Scanner sc= new Scanner(System.in, "windows-1252");
        
        System.out.print("Introduce el numero del DNI: ");
        
        dni=sc.nextLine();
        
        return dni;
    }
    
        private char calculoDni(String dni){
            
            char letra;
            int dniNumber= Integer.parseInt(dni);
            int resultado;
            
            
            dniNumber%=23;
            
            String word="TRWAGMYFPDXBNJZSQVHLCKE";
            
            return letra= word.charAt(dniNumber);
        }
    
        public String toString(){
            String resultado= "DNI: " + getDni() + "-" + getLetter();
            
            return resultado;
        }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }
        
        
}//end class
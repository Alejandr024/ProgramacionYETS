package prueba6;

/**
 *
 * @author Daw1
 */
public class CompararStrings {

    public static void main(String[] args) {
        String cadena1= "Pepe";
        String cadena2= "pepe";
        
        boolean resultado= comparar(cadena1,cadena2);
        
        System.out.println(resultado);
        System.out.println("Las cadenas son iguales? " + cadena1.equalsIgnoreCase(cadena2));
    }//end main
    
    
    static boolean comparar(String cadena1, String cadena2){
        boolean resultado= true;
        
        if(cadena1.length()==cadena2.length()){
            System.out.println("Miden lo Mismo.");
            for(int i=0; i<cadena1.length();i++){
                if(Character.toLowerCase(cadena1.charAt(i))!= Character.toLowerCase(cadena2.charAt(i))){
                    resultado= false;
                    break;
                }
            }
        }else{
            resultado= false;
            System.out.println("No miden lo mismo.");
        }
        
        System.out.print("Las cadenas son iguales? ");
        return resultado;
    }//end comparar    
}//end class
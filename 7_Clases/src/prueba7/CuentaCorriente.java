package prueba7;
import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class CuentaCorriente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in, "windows-1252");
        
        Cuenta usuario;
        
        System.out.print("Ingrese su DNI: ");
        String dni= sc.nextLine();
        
        System.out.print("Ingrese el titular: ");
        
        String name= sc.nextLine();
        
        
        
        System.out.print("Ingrese el saldo: ");
        double saldo= sc.nextDouble();
        
        System.out.print("Quieres poner el apelido?");
        boolean add=sc.nextBoolean();
        
        if(add){
            System.out.print("Añade el apellido: ");
            String lastname=sc.nextLine();
            usuario= new Cuenta(dni,name,lastname,saldo);
        }else{
            usuario= new Cuenta(dni,name,saldo);        
        }
        
        usuario.mostrar();
        
        
//        usuario.ingresar(1234.55);
        
//        usuario.retirar(50);
        
        
    }//End main
    
}//end class

package prueba7;
import java.util.Scanner;
/**
 *
 * @author Daw1
 */
public class Cuenta {
    
    Scanner sc= new Scanner(System.in,"windows-1252");
    
    private String dni;
    public String name;
    double saldo=0;
    String lastname;
    
    public Cuenta(String dni, String name){
        this.dni= dni;
        this.name= name;
        this.saldo= 0;
    }
    
    Cuenta(String dni, String name, double saldo){
        this.dni= dni;
        this.name= name;
        this.saldo= saldo;
    }

    Cuenta(String dni, String name, String lastname, double saldo){
        this.dni= dni;
        this.name= name;
        this.lastname= lastname;
        this.saldo= saldo;
    }
    
    public void operacion(){
        if(saldo==0)
        System.out.println("No es posible sacar dinero, no tienes saldo.");
    }
    
    public void mostrar(){
        System.out.println("DNI: "+ getDni() + "\nTitular: " + getName() + "\nSaldo: " + getSaldo() + " euros.");
    }

    public void ingresar(double dinero){
        saldo +=dinero;
        System.out.println("Quieres ver el saldo? (si/no)");
        String ver= sc.nextLine();
        if(ver.equals("si")){
            System.out.println("Saldo despues del ingreso: " + saldo + " euros.");
        }
    }
    
    public void retirar(double dinero){
        
        if(saldo>=dinero){
            saldo -=dinero;
            System.out.println("La operacion se ha realizado correctamente.");
            System.out.println("Quieres ver el saldo? (si/no)");
            String ver= sc.nextLine();
            if(ver.equals("si")){
                System.out.println("Saldo despues del ingreso: " + saldo + " euros.");
            }
        }else {
            System.out.println("La operacion no se ha podido realizar, saldo insuficiente.");
        }
        
       
        
    }
    
    public String toString (){
        String resultado=("DNI: "+ getDni() + "\nTitular: " + getName() + "\nSaldo: " + getSaldo() + " euros.");
               
        
        return resultado;
    }
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param name       the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param saldo the saldo to set
     */
    
}

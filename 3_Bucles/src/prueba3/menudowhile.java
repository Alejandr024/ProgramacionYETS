/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;
import java.util.Scanner;

/**
 *
 * @author alej3
 */
public class menudowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int opcion;
         float saldo;


         
         do{
            System.out.println("""
                 Bienvenido al banco Skidbidi Bank. Por favor, eliga una opción: 
                                1: Ingresar
                                2: Retirar
                                3: Transferir
                                4: Salir""");
             
            opcion = sc.nextInt();
            if(opcion>=1 && opcion<=3){

            
            System.out.println("Ingrese su saldo: ");
            saldo =sc.nextInt();
            System.out.println("Su saldo es de " + saldo + " euros.");
            
          if(opcion==1){
            System.out.print("¿Cuánto quieres ingresar? ");
            float ingress = sc.nextFloat();
            
             while(ingress<=0.09){
            
                System.out.println("El ingreso tiene que ser, como mínimo, "
                        + "de 0,1 euros. Por favor, inténtelo de nuevo.");
                ingress = sc.nextFloat();
            
        }if(ingress>=0.10){
            float total= saldo + ingress;
            System.out.println("Has ingresado "+ ingress + " euros. El saldo "
                    + "total en el banco es de: " + total + " euros.");
            }  
        }
        
        if(opcion==2){
            System.out.print("¿Cuánto quieres retirar? ");
            float retire = sc.nextFloat();
            
             while(retire<=0.09 || retire>saldo){
            
                System.out.println("El retiro tiene que ser, como mínimo, "
                        + "de 0,1 euros, y no puede pasarse de su saldo. Por favor, "
                        + "inténtelo de nuevo.");
                retire = sc.nextFloat();
                
        } if (retire>=0.10 || retire<=saldo){
            float total= saldo - retire;
            System.out.println("Has retirado "+ retire + " euros. El saldo "
                    + "total en el banco es de: " + total + " euros.");
            }
        }
        
        if(opcion==3){
            
            System.out.println("¿A qué usuario quieres transferir?");
            String user= sc.next();
            
            System.out.println("¿Cuánto quieres transferir? ");
            float transfer = sc.nextFloat();
            
            while(transfer<5 || transfer>saldo){
            
                System.out.println("La transferencia tiene que ser, como mínimo, "
                        + "de 5 euros, y no puede pasarse de su saldo. Por favor, "
                        + "inténtelo de nuevo.");
                
                transfer=sc.nextFloat();
                
            } if(5<=transfer || transfer<=saldo){
                float total= saldo-transfer;
               System.out.println("El usuario " + user + " ha recibido " + transfer
                + " euros. Su saldo en el banco queda en: " + total + " euros.");
        }
       }
    }
        while(opcion<1 || opcion>4){
            System.out.println("Opción, incorrecta. Por favor, inténtelo de nuevo.");
            opcion=sc.nextInt();
        } if(opcion==4){
        System.out.println("Gracias por confiar en Skibidi Bank.");
        break;
    }
    } while(opcion<=3); {

        System.out.println("¡Que tenga un buen día!");
        }
    }//end main 
 }//end class
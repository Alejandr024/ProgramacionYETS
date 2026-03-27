/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Daw1
 */
public class EjemploReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int [] agenda= {1,2,3,4,5};
        System.out.println("Referencia inicial agenda: " + agenda);
        
        System.out.println("Dimension agenda: " + agenda.length);
        
       
        System.out.print("Introduce un numero entero para agregar en la agenda: ");
        
        int valor= sc.nextInt();
        
        
        agenda= add(agenda, valor);
        System.out.println(agenda);
        
    }//end main
    
    static int[] add(int[] agenda, int valor){
        
        int[] agendaAux= new int [agenda.length + 1];
        
        for(int i = 0; i<agenda.length; i++){
            agendaAux[i]=agenda[i];
            }
        agendaAux[agendaAux.length - 1]= valor;
        System.out.println("Valores de agendaAux: " + Arrays.toString(agendaAux));
        
        System.out.println("Referencia agendaAux desde funcion: " + agendaAux);
        
        agenda= agendaAux;
        
        System.out.println("Agenda actualizada con agendaAux: " + Arrays.toString(agenda));
        System.out.println("Referencia actualizada agenda: " + agenda);
        
        return agendaAux;
    }//end add
    
}//end class
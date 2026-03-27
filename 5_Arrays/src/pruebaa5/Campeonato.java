/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaa5;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daw1
 */
public class Campeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador=1;
        int[] participantes= new int [5];
        
        int nota=0;
        
        for(int i=0; i<5; i++){
            System.out.print("Ingrese la nota del concursante " + (i+1) + ": " );
            participantes[i]= sc.nextInt();
        }
        
        
        do{
           
            System.out.print("Ingrese la nota del concursante " + contador + ": ");
            
            nota= sc.nextInt();
            
            
            if(nota>=0){
                participantes= add(participantes, nota);
            }
            
            contador++;
        }while(nota>=0);
        
        Arrays.sort(participantes);
        
        System.out.println("Notas participantes: " + Arrays.toString(participantes));
        
    }//end main
    
    static int[] add(int[] agenda, int valor){
        
        int[] agendaAux= new int [agenda.length + 1];
        
        for(int i = 0; i<agenda.length; i++){
            agendaAux[i]=agenda[i];
            }
        agendaAux[agendaAux.length - 1]= valor;
        
        
        return agendaAux;
    }//end add
    
    
}//end class
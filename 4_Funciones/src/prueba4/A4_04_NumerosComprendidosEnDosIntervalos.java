package prueba4;

import java.util.Scanner;
/**
 * @author Alejandro Gómez
 */

public class A4_04_NumerosComprendidosEnDosIntervalos {

      static void intervalo(int n1, int n2){
          int mayor = n1 > n2 ? n1 : n2;
          int menor = n1 < n2 ? n1 : n2; 

          System.out.print("Los numeros comprendidos entre " + menor + " y " + mayor + " son ");
          for(int i =menor ++; i<=mayor; i++){
            while(i<mayor){
              System.out.print(i + ", ");
              i++;
            }
/*
          if((mayor-i)+1 <mayor){
                System.out.print((i-1) + " ");
            }
            
            if((mayor-1)+1==i){
                System.out.print("y ");
            }
*/         
            if(i == mayor){
                System.out.println(i +".");
                break;
            }
        }
    }//end intervalo

        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Ingrese un numero entero: ");
          int n1 = sc.nextInt();
          System.out.print("Ingrese otro numero entero: ");
          int n2 = sc.nextInt();
            
          intervalo(n1, n2);

          sc.close();
    }//end main    
}//end clas
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

/**
 *
 * @author Daw1
 */
public class MainLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayLista1= {1,2,3};
        int[] arrayLista2={4,5,6,7};
        
        
        Lista lista1 = new Lista(arrayLista1);
        Lista lista2 = new Lista(arrayLista2);
        
        Lista suma1= lista1.concatenar(lista2);
        Lista suma2= Lista.concatenar(lista1, lista2);
        
        System.out.println(suma1);
        System.out.println(suma2);
        
        
    }//end main
    
}//end class
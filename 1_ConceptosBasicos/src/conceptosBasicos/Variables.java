package conceptosbasicos;

import java.util.Scanner;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class Variables {
    // USAR MAYUS + F6 PARA EJECUTAR TODOS LO MOSTRADO
    public static void main(String[] arg) {
    //Ejemplo de mostrar operación aritmética por pantalla    
        System.out.println(23-3);
        System.out.println(120+20);
        //Problema con la división de enteros. Problema de truncamiento a enteros
        System.out.println(10/3);
        //Si uno de los operandos es float od double, el resultado es decimal
        System.out.println(10./3);
        //Operador restos: %
        System.out.println(10%3);
        
        //Problemas operaciones con variables tipo byte
        byte valor1= 23-3;
        System.out.println(valor1);  //No hay problema
        
        byte x = 2;
        byte y = 3;
        //Hacer un casting para evitar problemas de conversión: ej: (byte) (x+y)
        byte z = (byte)(x + y);
        System.out.println(z);
        
        System.out.println((double)(10/3));
        
        // OPEADORES INCREMENTALES Y DECREMENTALES
        
        /** operador incremetnal: ++
         * Operador decremental: --
         */
        
        int b = 5;
        int a = 2;
        //b+=++a:b=b+(a+1)
        //INcremental Izquierda -> Incremetna 'a' antes de la operación 
        b +=++a;
        System.out.println(" El valor de 'a', después de hacer \"b += ++a\" es igual a: " + a);
        System.out.println(b);
        
        //Incremental derecha -> INcrementa 'd' después d ela operación
        int c = 10;
        int d = 2;
        c+= d++;
        System.out.println(" El valor de 'd', después de hacer \"c += d++\" es igual a: " + d);
        System.out.println(c);
        
        double e = 5 + 3.*2/4;
         System.out.println("Valor de e: " + e);
         
        e = (double) (5 + 3.*2)/4;
         System.out.println("Valor de e: " + e);
         
        // DESBORADMIENTO
        
        // byte l= 129; //error fuera de rango
        
        byte l = 127;
        l++;
         System.out.println(1);
         
        /** Relacionales: son booleanos: ej:
         * 5>3 (true)
         * 2>5 (false)
         * 4==3 (false)
         * 4==4 (true)
         */
        
//        
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Introduce un valor verdadero o falso: (true/false): ");
//             boolean name = entrada.nextBoolean();
//              System.out.println(name);
//
//              
//              
//        double raiz = Math.sqrt(25);
//        System.out.println("Raíz cuadrada: " + raiz);
//        
//        double potencia = Math.pow(5,2);
//        System.out.println("Potencia: " + potencia);
//        
//        
//        System.out.println("Número pi: " + Math.PI);
//        
//        System.out.println("Redondeo: " + Math.round(3.955555));
         
    } // Usar refactor para mover proyectos. También renombrar varuables dentrpo del proyecto
}
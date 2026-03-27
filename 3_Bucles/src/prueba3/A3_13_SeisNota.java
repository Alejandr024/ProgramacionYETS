package prueba3;

import java.util.Scanner;

public class A3_13_SeisNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int contador_aprobados = 0;
        int contador_suspensos = 0;
        int contador_condicionados = 0;
        

        for (int i = 1; i <= 6; i++) {
            do {
                System.out.print("Introduce una nota (0-10): ");
                nota = sc.nextInt();
        } while (nota <0 || nota > 10);

                 if(nota >= 5) {
                    contador_aprobados++;
                    } else if (nota == 4) {
                        contador_condicionados++;
                    } else {
                        contador_suspensos++;
            }
        System.out.println("El numero de aprobados son " + contador_aprobados);
        System.out.println("El numero de suspensos son " + contador_suspensos);
        System.out.println("El numero de condicionados son " + contador_condicionados);
        sc.close();
        
    }
    }//end main
}//end class
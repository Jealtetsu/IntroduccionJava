/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package introjava1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Deber_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
         System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        int suma= num1 + num2;
        System.out.println("La suma del número " + num1 + " y el número " + num2 + " es "+ suma );
        
        
                
        
    }
    
}

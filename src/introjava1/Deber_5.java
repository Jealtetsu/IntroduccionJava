/*
 * Escribir un programa que lea un númera entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese
número
 */
package introjava1;

import java.util.Scanner;

public class Deber_5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        int doble = 2*num;
        int triple = 3*num;
        double raíz = Math.sqrt(num);
        
        System.out.println("El doble del número " +num+ " es " + doble + ", el triple es " +triple+ " , la raíz cuadrada es " + raíz); 
        
        
        
        
        
    }
    
}

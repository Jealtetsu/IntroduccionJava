/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas
.
 */
package introjava1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Deber_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    System.out.println("la frase en letras mayúsculas es " + frase.toUpperCase());
    System.out.println("la frase en letras minúsculas es " + frase.toLowerCase());
    
    
    
    }
    
 
}

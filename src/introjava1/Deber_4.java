/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. La fórmula correspondiente es: F=32+(9*C/5)
 * 
 */
package introjava1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Deber_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la temperatura en grados centígrados");
         int temperatura = leer.nextInt() ;
         int temperatura2= (32 + (9 * temperatura)/5 );
         System.out.println(+ temperatura + "°C es igual a " +temperatura2 + " Fahrenhit");
         
        
        
                
    }
    
}

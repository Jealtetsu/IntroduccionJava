/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 * and open the template in the editor.
 */
package introjava1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Deber_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("El nombre que has ingresado es " + nombre);
        
        
        
    }
    
}

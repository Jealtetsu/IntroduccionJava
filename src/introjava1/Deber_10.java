/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Deber_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
        
        */
        
        Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese un valor ´límite positivo");
         int max= leer.nextInt();
         int suma=0;
          do  {
        System.out.println("Ingrese un número");
        int num= leer.nextInt();
         suma += num;
        
        } while (suma <= max );
                          
        System.out.println("Superó el límite máximo");
    }
    
}

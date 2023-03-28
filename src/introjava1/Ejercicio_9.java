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
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        
        
        int num1, suma;
        suma = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println(" Ingrese el " + i + "° numero ");
            num1 = sc.nextInt();
            if (num1 == 0){
                System.out.println("se ha capturado el 0");
                break;
                
            } else if (num1 < 0){
                
            } else if (num1 > 0) {
                suma = suma + num1;
                
            
        }
        }
        System.out.println("la suma de los numeros es " + suma );
    }
    
}





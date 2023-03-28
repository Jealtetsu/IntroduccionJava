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
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingresa el primer num");
        int num1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo num");
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
     
}
    public static void EsMultiplo(int num1, int num2){
        
        //logica
        
        if( num1%num2 == 0){
            System.out.println("Si son multiplos");
        } else {
            System.out.println("No son multiplos");
        }
                       
    }
}

        

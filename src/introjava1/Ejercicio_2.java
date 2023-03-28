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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int  num ;
        Scanner leer = new Scanner (System.in);
        do {
            System.out.println ("escribe tu nota ");
            num = leer.nextInt();
            if (num >= 0 && num <= 10){
                System.out.println("tu nota es valida ");
              break;  }
            
            else
                {System.out.println("tu nota no es valida ");  }


                
           } while (true);
            

        }
    }

    
        

   

    

    


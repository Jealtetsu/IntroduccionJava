/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Deber_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa el tamano del vector");
        int N = leer.nextInt();
        int []vector = new int[N];
         int cont = 0;
         String posicion = " ";
         
        for(int i=0;i<N;i++) {
           Random aleatorio = new Random();
            vector[i]=aleatorio.nextInt(10)+1;      
            System.out.print(" "+vector[i]+"  ");
        }
        
        
        System.out.println("\nIngrese el numero que desea verificar en el vector");
        int num=leer.nextInt();
       
        for(int i=0;i<N;i++) {
        if (num==vector[i]){
          
            cont++;
            posicion = posicion +" "+String.valueOf(i);
           
        }
                              
        }
         System.out.println("El numero "+num+ " se encuentra en las posiciones " +posicion);  
    System.out.println("El numero "+num+ " se repite "+ cont+ " veces");   
}
}
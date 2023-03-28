/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava1;

import java.util.Random;

/**
 *
 * @author USER
 */
public class Deber_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        matrizA(matriz);
       
    }
    public static void matrizA(int matriz[][]){
         Random aleatorio = new Random();
    for (int i=0; i<4; i++ ){
        for(int j=0; j<4; j++ ){
           matriz [i][j]= aleatorio.nextInt(10)+1;
            System.out.print("[" +matriz[i][j]+"]");
            
        }  System.out.println(" ");
    }
    System.out.println("Transpuesta");
    for (int j=0; j<4; j++ ){
        for(int i=0; i<4; i++ ){
                 
            System.out.print("[" +matriz[i][j]+"]");
        }  System.out.println(" ");
    }
    
}
    
}

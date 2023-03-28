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
public class Deber_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dado un numero determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        int retorno = parimpar(num);
        if (retorno == 0){
            System.out.println("El número es par");
        }else  {
          System.out.println("El número es impar");
        }
        
    }
    public static int parimpar (int num){
        int resultado = num%2;
        return resultado;
                
    }
}

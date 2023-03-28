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
public class Ejercicio_10_2da {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
        int[] numeros = new int[4];
        
        // Pedir al usuario que ingrese 4 números entre 1 y 20
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i+1) + " entre 1 y 20: ");
            numeros[i] = input.nextInt();
            // Verificar que el número esté entre 1 y 20
            while (numeros[i] < 1 || numeros[i] > 20) {
                System.out.println("El número debe estar entre 1 y 20.");
                System.out.print("Ingrese el número " + (i+1) + " entre 1 y 20: ");
                numeros[i] = input.nextInt();
            }
        }
        
        // Imprimir cada número seguido de asteriscos según su valor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        input.close();
    }
 }


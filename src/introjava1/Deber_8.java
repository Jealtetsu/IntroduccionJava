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
public class Deber_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);
        double nota = -1; // Asignar valor inválido a la nota

        while (nota < 0 || nota > 10) {
            System.out.print("Ingrese la nota (entre 0 y 10): ");
            nota = input.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("La nota ingresada no es válida.");
            }
        }

        System.out.println("La nota ingresada es: " + nota);
    }
}
        
        
        
        


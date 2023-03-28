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
public class Deber20GPT {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  



        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num, sumfila, sumcolumna, sumdiag1 = 0, sumdiag2 = 0;
        System.out.println("Ingrese los valores del cubo");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = leer.nextInt();
                while (num < 1 || num > 9) {
                    System.out.println("Valor invalido. Ingresa nuevamente");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + matriz[i][j] + ")");
            }
            System.out.println(); // Imprime un salto de línea después de cada fila
        }

        // Suma filas
        for (int i = 0; i < 3; i++) {
            sumfila = 0; // Inicializa sumfila en 0 en cada iteración
            for (int j = 0; j < 3; j++) {
                sumfila += matriz[i][j];
            }
            System.out.println("En la fila " + (i + 1) + " la suma es: " + sumfila);
        }

        // Suma columnas
        for (int j = 0; j < 3; j++) {
            sumcolumna = 0; // Inicializa sumcolumna en 0 en cada iteración
            for (int i = 0; i < 3; i++) {
                sumcolumna += matriz[i][j];
            }
            System.out.println("En la columna " + (j + 1) + " la suma es: " + sumcolumna);
        }

        // Suma diagonal 1
        for (int i = 0; i < 3; i++) {
            sumdiag1 += matriz[i][i];
        }
        System.out.println("En la diagonal 1 la suma es " + sumdiag1);

        // Suma diagonal 2
        for (int i = 0, j = 2; i < 3; i++, j--) {
            sumdiag2 += matriz[i][j];
        }
        System.out.println("En la diagonal 2 la suma es: " + sumdiag2);

        leer.close();
    }
}
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
public class Deber_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int opcion;
        do {
        System.out.println("Ingrese dos números");
                 System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        
         
              // Mostrar menú y pedir opción al usuario
            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            System.out.print("Elija opción: ");
            opcion = leer.nextInt();    
            
            switch (opcion){
                case 1:
                    System.out.println("La suma es: " +(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: " +(num1-num2));
                    break;
                case 3:
                    System.out.println("El producto es: " +(num1* num2));
                    break;    
                 case 4:
                     if (num2 ==0){
                         System.out.println("No se puede dividir por cero");
                     } else {
                    System.out.println("La división es: " +((double)num1 / num2));
                    break;    
                    
                } case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N)? ");
                    char letra = leer.next().charAt(0);
                    if (letra == 'S' || letra == 's'){
                        System.out.println("Saliendo del programa....");
                      return;
                    }
                    break;   
                    
                    default:
                        System.out.println("Opción inválida");
            }
          }    while (opcion != 5);
        
      }    
     
   }
    


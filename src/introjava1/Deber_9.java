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
public class Deber_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java. */
 
         Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("Ingrese una frase");
         do  {
        frase = leer.nextLine();
       String frase1 = frase.substring(0,1);
        if (frase1.equals("A")) {
            System.out.println("Correcto");
            break;
             } else {
            System.out.println("Incorrecto, intenta nuevamente");
         }      
         } while (frase!="A");
         }
         }
        
 
 
    
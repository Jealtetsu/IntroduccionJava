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
public class Ejercicio_9vs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  /**
 *
 * @author pdrgo
 */

//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
//el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
//Nota: recordar el uso de la sentencia break.
    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
 //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    //5 *****
    //3 ***
    //11 ***********
    //2 **
    /**
     * @param args the command line arguments
     */
 
        Scanner leer = new Scanner(System.in);
        
        int num;
        int contador = 0;
        int suma = 0;
        System.out.println("Ingresa 20 num");
        do{
        contador++;
        num = leer.nextInt();
        
        if(num == 0){
        System.out.println("Se capturó el numero cero");
        break;
        }else if(num>=0){
        suma += num;
        }
        
        }while(contador<20);
        System.out.println(suma);
    }
    }
    



    

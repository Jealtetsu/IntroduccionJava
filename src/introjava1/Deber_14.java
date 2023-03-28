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
public class Deber_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] cantidad = new double[4];

        System.out.println("Ingrese una cantidad en euros");
        cantidad[0] = leer.nextDouble();
        cantidad[1] = cantidad[0] * 0.86;
        cantidad[2] = cantidad[0] * 1.28611;
        cantidad[3] = cantidad[0] * 129.852;
        //System.out.println(" "+cantidad[0]+ "  "+cantidad[1]+ "  "+cantidad[2]+ "  "+cantidad[3]);    
        String opcion;
        do {            
          
            System.out.println ("Escribe la conversion que quiere realizar\n Libras \n Dolares \n Yenes");
             opcion = leer.next();
            opcion = opcion.toUpperCase();
            switch (opcion) {
                case "LIBRAS":
                    System.out.println("La conversion a Libras es; " + cantidad[1]);
                    break;
                case "DOLARES":
                    System.out.println("La conversion a Dolares es; " + cantidad[2]);
                    break;
                case "YENES":
                    System.out.println("La conversion a Yenes es; " + cantidad[3]);
                    break;
                default:
                    System.out.println("La conversion seleccionada es incorrecta");
              }         
           } while (!opcion.equals("LIBRAS") && !opcion.equals("DOLARES") && !opcion.equals("YENES"));
        }
      }   
        
        
    //while(!(opcion.equals("LIBRAS") && opcion.equals("DOLARES") && opcion.equals("YENES")));
        //while (!opcion.equals("LIBRAS") && !opcion.equals("DOLARES") && !opcion.equals("YENES"));
        /*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
                                            */

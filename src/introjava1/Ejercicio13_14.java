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
public class Ejercicio13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        
        String[]equipo = new String[8];
        
        for (int i=0; i<8; i++){
        System.out.println("Ingresa el nombre");
        equipo[i] = leer.nextLine();
        }
        String aux = "";
        for (String lectura: equipo){
            aux += " " + lectura;
        }
        System.out.println(aux);
}
}


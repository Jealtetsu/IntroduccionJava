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
public class Ejercicio13_14vs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
String[] Equipo=new String[7];
for(int i=0;i<7;i++){
    System.out.println("Ingresa el nombre");
    Equipo[i]=leer.nextLine();
}
for(int i=0;i<7;i++){
    System.out.print("("+Equipo[i]+")");
}
    System.out.println(" ");
    }
}
/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. */



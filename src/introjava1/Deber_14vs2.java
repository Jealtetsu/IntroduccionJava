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
public class Deber_14vs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce la cantidad de euros que quieres convertir: ");
            double euros = sc.nextDouble();
            System.out.print("Introduce la moneda a la que quieres convertir (libras, dolares o yenes): ");
            String moneda = sc.next();
            
            convertirMoneda(euros, moneda);
        }
    }
    
    public static void convertirMoneda(double euros, String moneda) {
        
        double cambio = 0.0;
        String nombreMoneda = "";
        
        switch(moneda.toLowerCase()) {
            case "libras":
                cambio = 0.86;
                nombreMoneda = "libras";
                break;
            case "dolares":
                cambio = 1.28611;
                nombreMoneda = "dólares";
                break;
            case "yenes":
                cambio = 129.852;
                nombreMoneda = "yenes";
                break;
            default:
                System.out.println("Moneda no válida.");
                return;
        }
        
        double resultado = euros * cambio;
        System.out.println(euros + " euros equivalen a " + resultado + " " + nombreMoneda + ".");
    }
}
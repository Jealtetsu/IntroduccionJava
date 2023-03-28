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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String retorno;
        String frase;
        
        System.out.println("Ingresa una frase");
        frase = leer.nextLine();
        retorno = lectura(frase); 
        
        System.out.println(retorno);
     
}
    public static String lectura(String frase){
        
    String retorno="";
        for (int i=0; i<frase.length(); i++){
            char letras = frase.charAt(i);
        switch (letras){
            case 'a':
            case 'A':    
                retorno += "@";
                break;
            case 'e':
            case 'E':    
                retorno += "#";
                break;
            case 'i':
            case 'I':    
                retorno += "$";
                break;
            case 'o':
            case 'O':    
                retorno += "%";
                break;
            case 'u':
            case 'U':    
                retorno += "*";
                break;
            default:
                retorno += letras;
        }
        }        
        return retorno;
    }
}


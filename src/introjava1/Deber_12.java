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
public class Deber_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas.
        */
        Scanner leer = new Scanner (System.in);
        ingresa();
               
    }
    
    public static void ingresa() {
         Scanner input = new Scanner(System.in);
        String entrada;
        int correctas, incorrectas;
        correctas=0;
        incorrectas=0;
                
        do{
            System.out.println("Ingrese una cadena al dispositivo RS232");
            entrada=input.nextLine();
            int leng=entrada.length();
            if(entrada.substring(0, 1).equals("X") && entrada.substring(leng-1,leng).equals("O") && leng<=5 ){
                correctas+=1;
            }else if(entrada.equals("&&&&&")){
                
            }else{
                incorrectas+=1;
            }
            
            
        }while(!(entrada.equals("&&&&&")));
        
        System.out.println("Se tuvieron " + correctas + " lecturas correctas y " + incorrectas + " incorrectas.");
        
        
    }
    
}

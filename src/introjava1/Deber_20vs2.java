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
public class Deber_20vs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      Scanner leer = new Scanner (System.in);
int [][]matriz = new int [3][3];
int num, sumfila=0, sumcolumna=0, sumdiag1, sumdiag2;
      System.out.println("Ingrese los valores del cubo");
      for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
      num=leer.nextInt();
      while (num<1 || num>9){
          System.out.println("Valor invalido. Ingresa nuevamente");  
          num=leer.nextInt();
      }
      matriz [i][j]=num;
      }
      }
      System.out.println("La matriz es: ");
      for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){    
            System.out.print("("+matriz[i][j]+")");
      }
            System.out.println(" "); 
      } 
      //suma filas
      for(int i=0;i<3;i++){
          sumfila=0;
      for(int j=0;j<3;j++){
          //+=es lo mismo que sumafila=sumafila+matriz[i][j]
          sumfila+=matriz[i][j];
          }
           System.out.println("En la fila "+(i+1)+" es:"+sumfila);
           
          }
    for(int j=0;j<3;j++){
          sumcolumna=0;
      for(int i=0;i<3;i++){
          //+=es lo mismo que sumafila=sumafila+matriz[i][j]
          sumcolumna+=matriz[i][j];
          }
           System.out.println("En la columna "+(j+1)+" es:"+sumcolumna);
           
          }
    sumdiag1=0;
for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
         if (i==j){
          sumdiag1+=matriz[i][j];
          }
       
       }
}    System.out.println("En la diagonal 1 la suma es "+sumdiag1);
    
    
sumdiag2=0;
/* 
for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
         if(i==0 && j==2){
          sumdiag2+=matriz[i][j];
          break;
          }
         else if(i==1 && j==1){
             sumdiag2+=matriz[i][j];
              break;
         }
         else if(i==2 && j==1){
             sumdiag2+=matriz[i][j];
         }
                      
          }
}  System.out.println("En la diagonal 2 es: "+sumdiag2);
*/       
           for (int i = 0, j = 2; i < 3; i++, j--) {
            sumdiag2 += matriz[i][j];
        }
        System.out.println("En la diagonal 2 la suma es: " + sumdiag2);

       
    }}
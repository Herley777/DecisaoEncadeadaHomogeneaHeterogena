/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class AtvOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o Primeiro valor de um lado em centimetros");
        double lado1 = scanner.nextDouble();
        System.out.println("Informe o Segundo valor de um lado em centimetros");
        double lado2 = scanner.nextDouble();
        System.out.println("Informe o Terceiro valor de um lado em centimetros");
         double lado3 = scanner.nextDouble();
         
         //Verificacão de que se os lados sao positivos ou iguais a zero,para assim saber se corresponde a um triangulo
          if(lado1<=0 || lado2<=0 || lado3<=0)
              {
                  System.out.println("O Lados Devem ser Positivos e nao sem valores ou negativos");
                  
                  //Verificacao de que se os valores correspondem a um triangulo
                  }else if(lado1 + lado2 <=lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1){
                      System.out.println("Nao e um Triangulo");
                      
                      //Verificacao de qual tipo de Triangulo é baseado nos valores de entrada dos lados
                  }else{
                       if(lado1==lado3 && lado1==lado2 && lado1>0 && lado2>0 && lado3>0  ){
            System.out.println("Triangulo Equilatero "+lado1 + "/" +lado2 + "/" +lado3);
 }
              if((lado1==lado2 && lado1+lado2 > lado3) || (lado1==lado3 && lado1+lado3 > lado2) || (lado2==lado3 && lado2+lado3 > lado1) ){
       System.out.println("Triangulo Isosceles "+lado1 + "/" +lado2 + "/" +lado3);
              }
           
              if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
                  System.out.println("Triangulo Escaleno " +lado1 + "/" +lado2 + "/" +lado3);
                  }
                     
                      
                 
              
             
          }
         
     
              
              
             
               scanner.close(); 
              }
    }
              
    


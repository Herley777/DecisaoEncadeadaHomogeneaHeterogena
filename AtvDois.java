package com.mycompany.decisaoencadeadaheterogeneahomogenea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class AtvDois {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
           double IMC; 
            double Altura ;
            double Peso;
            
           
            
            System.out.println("Ola");
            
            System.out.println("Qual o Seu Peso: ?:");
            Peso = scanner.nextDouble();
            
            System.out.println("E Qual a Sua Altura: ?");
            Altura = scanner.nextDouble();
            
            System.out.println("Sua Altura : "+Altura);
            System.out.println("Seu Peso : "+Peso);
                       IMC = Peso/(Altura*Altura);
                       

            
            if(IMC>=18 && IMC<25){
                System.out.println("IMC Saudavel : " +IMC);
            }else{
                System.out.println("");
            }
            
            
            
            if(IMC<18){
                System.out.println("IMC Magreza: " +IMC);
            }else{
                System.out.println("");
            }
            
            if(IMC>=25 && IMC<30){
                System.out.println("IMC SobrePeso: " +IMC);
            }else{
                System.out.println("");
            }
            
            if(IMC>=30){
                System.out.println("IMC Obesidade: " +IMC);
            }else{
                System.out.println("");
            }
            
            scanner.close();
        }
        
    }
    
}


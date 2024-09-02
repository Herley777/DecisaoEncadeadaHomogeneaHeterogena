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
public class AtvSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola,Nadador");
        System.out.println("Informe sua idade, para identificarmos em que categoria voce se encontra:");
        int idade = scanner.nextInt();
        
        
        if(idade>=5 && idade<=7){
            System.out.println("Infantil A " +idade);
        }
        if(idade>=8 && idade<=10){
            System.out.println("Infantil B " +idade);
        }
        
        if(idade>=11 && idade<=13){
            System.out.println("Juvenil A " +idade);
        }
        if(idade>=14 && idade<=17){
            System.out.println("Juvenil B " +idade);
        }
        
        if(idade>=18){
            System.out.println("Senior " +idade);
        }
        
        scanner.close();
    }
}

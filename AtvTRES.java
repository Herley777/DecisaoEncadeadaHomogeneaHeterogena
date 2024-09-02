/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decisaoencadeadaheterogeneahomogenea;
import java.util.Scanner;
/**
 *
 * @author DaniB
 */
public class AtvTRES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ola, Bem vindo ao McDonalds");
        
        System.out.println("Temos Diversas opcoes de lanches,irei mostar o cardapio, para o senhor(a) escolher que lanche ira pedir");
        
        System.out.println("Cardapio: 1.BigMac , 2.Quarteirao , 3.MacChicken , 4.Cheddar , 5.CheeseBurguer");
        int opcao = scanner.nextInt();
        
        
        if(opcao>=1 && opcao<=5){
            System.out.println("Opcao escolhida Valida: " +opcao);
        }else{
            System.out.println("Opcao escolhida Invalida: " +opcao);
        }
        
       scanner.close();
    }
 
}

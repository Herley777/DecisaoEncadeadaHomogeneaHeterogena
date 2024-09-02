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
public class AtvCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ola, Aluno");
        System.out.println("Peco-te que Digite as suas 4 notas, Para Dizer se foi aprovado ou nao na media dessas 4 notas somadas");
        
        System.out.println("Informe sua Primeira Nota1");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Informe sua Segunda Nota2 ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Informe sua Terceira Nota3");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Informe sua Quarta Nota4");
        double nota4 = scanner.nextDouble();
        
        double media;
        
        media= (nota1+nota2+nota3+nota4)/4;
        
        if(media>=9){
            System.out.println("A - Aprovado " +media);
        }
        
        if(media>=7 && media<9){
            System.out.println("B - Aprovado " +media);
        }
        
        if(media>=5 && media<7){
            System.out.println("C - Aprovado " +media);
        }
        
        if(media>=2.5 && media<5){
        
        System.out.println("D - Reprovado " +media);
    }
        
        if(media<2.5){
            System.out.println("E - Reprovado " +media);
        }
        
        scanner.close();
    }
}

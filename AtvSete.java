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
public class AtvSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o dia da primeira data");
        int dia1 = scanner.nextInt();
        
        System.out.println("digite o mes da primeira data");
        int mes1 = scanner.nextInt();
        
        System.out.println("digite o ano da primeira data");
        int ano1 = scanner.nextInt();
        
        
        System.out.println("digite o dia da segunda data");
        int dia2 = scanner.nextInt();
        
        System.out.println("digite o mes da segunda data");
        int mes2 = scanner.nextInt();
        
        System.out.println("digite o ano da segunda data");
        int ano2 = scanner.nextInt();
        
        
        if((dia1<dia2 && mes1==mes2 && ano1==ano2) || (dia1==dia2 && mes1<mes2 && ano1==ano2) || (dia1==dia2 && mes1==mes2 && ano1<ano2) || (dia1<dia2 && mes1<mes2 && ano1==ano2) || (dia1==dia2 && mes1<mes2 && ano1<ano2) || (dia1<dia2 && mes1==mes2 && ano1<ano2) || (dia1==dia2 && mes1==mes2 && ano1==ano2) || (dia1<dia2 && mes1<mes2 && ano1<ano2) ){
            System.out.println("datas em ordem crescente: " +dia1 +"/"+mes1 +"/"+ano1 +  " - "   +dia2 +"/"+mes2 +"/"+ano2 );
        }else{
            System.out.println("datas em ordem crescente: " +dia2 +"/"+mes2 +"/"+ano2 +  " - "   +dia1 +"/"+mes1 +"/"+ano1);
        }
    }
}

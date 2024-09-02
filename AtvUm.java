package com.mycompany.decisaoencadeadaheterogeneahomogenea;

/*
 * 
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class AtvUm {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ola");
        
        System.out.println("Qual a hora de inicio do seu turno de trabalho? ");
        double turno = scanner.nextDouble();
        
        if(turno<13 && turno>=5 ){
            System.out.println("Voce comeca no Turno da Manha");
        }else{
            System.out.println(".");
        }
       
        if(turno>=13 && turno<21){
            System.out.println("Voce comeca no Turno da Tarde ");
        }else{
            System.out.println(".");
        }
        
        if(turno>=21 || turno<5){
            System.out.println("Voce comeca no Turno da Noite");
        }else{
            System.out.println(".");
        }
        scanner.close();
    }
}

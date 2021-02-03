/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Boletin7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Teclea o nome da primeira persona:");
        String nome1 = sc.next();
        System.out.println("Teclea o peso da primeira persoa:");
        short peso1 = sc.nextShort();
        System.out.println("Teclea o nome da segunda persoa:");
        String nome2 = sc.next();
        System.out.println("Teclea o peso da segunda persoa");
        short peso2 = sc.nextShort();
        
        if(peso1>peso2)
            System.out.println(nome1+ ", "+peso1+"kg. "+"A diferencia é de "+(peso1-peso2)+"kg");
        if(peso2>peso1)
            System.out.println(nome2+ ", "+peso2+"kg. "+"A diferencia é de "+(peso2-peso1)+"kg");
        if(peso1==peso2)
            System.out.println("Ambas persoas pesan igual.");
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_3;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Boletin7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        
        if(numero>0)
            System.out.println("+");
        if(numero == 0)
            System.out.println("0");
        if(numero<0)
            System.out.println("-");
        
        
        
        
        
        
        
    }
    
}

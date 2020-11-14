/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_2;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Boletin7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce o primeiro numero");
        short num1 = sc.nextShort();
        System.out.println("Introduce o segundo numero");
        short num2 = sc.nextShort();
        
        System.out.println("A suma de "+num1+"+"+num2+" é "+(num1+num2) );
        if(num1>=num2)
            System.out.println("A resta de "+num1+"-"+num2+" é "+(num1-num2));
        
        
        
    }
    
}

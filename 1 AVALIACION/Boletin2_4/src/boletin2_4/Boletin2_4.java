
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero1, numero2,suma,resta,producto,cociente;
        System.out.println("Introduce o primeiro numero:");
        numero1 = sc.nextFloat();
        System.out.println("Introduce o segundo numero");
        numero2 =sc.nextFloat();
        suma = numero1+numero2;
        System.out.println(numero1+"+"+numero2+"="+suma);
        resta = numero1-numero2;
        System.out.println(numero1+"-"+numero2+"="+resta);
        producto = numero1*numero2;
        System.out.println(numero1+"*"+numero2+"="+producto);
        cociente = numero1/numero2;
        System.out.println(numero1+"/"+numero2+"="+cociente);
        
        
        
        
        
    }
    
}

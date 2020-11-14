
package boletin2_.pkg3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float euros,cambio = 1.17f;
        System.out.println("Teclea o importe :");
        euros = sc.nextFloat();
        System.out.println(euros+" euros ="+euros*cambio+" dólares");
        
    }
    
}


package boletin3_2;

import java.util.Scanner;

public class Boletin3_2 {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        float grados,kelvin,fahrenheit;
        System.out.println("Teclea os grados centígrados: ");
        grados=sc.nextFloat();
        kelvin=grados + 273;
        fahrenheit=grados*1.8f+32;
        System.out.println("Os graos kelvin son ="+ kelvin);
        System.out.println("Os grados fahrenheit son ="+ fahrenheit);
    }
    
}

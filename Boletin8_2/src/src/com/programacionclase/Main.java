package src.com.programacionclase;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona opción 1, 2 ou 3:"));
        if (opcion==1){
            float lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado del cuadrado :"));
            System.out.println("O área do cadrado é : "+lado*lado);
        }
        else if(opcion==2){
            float base = Float.parseFloat(JOptionPane.showInputDialog("Introduce a base :"));
            float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce a altura : "));
            System.out.println("O área do triángulo é : "+(base*altura)/2);
        }
        else if(opcion == 3){
            float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce o radio : "));
            System.out.println("O área do círculo é : "+(3.14*(radio+radio)));
        }
        else {
            System.out.println("Opción incorrecta.");
        }
    }
}

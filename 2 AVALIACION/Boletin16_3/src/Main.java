import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String texto = "www.javadesde0.com";
        String parte1 = "";
        String parte2 = "";
        for (int i = 0; i <8; i++) {
            parte1 = parte1+texto.charAt(i);
        }
        for (int i = 8; i < texto.length(); i++) {
            parte2 = parte2+texto.charAt(i);
        }
        System.out.println("Parte 1 do texto: "+parte1+"\nParte 2 do texto: "+parte2);
        String textoNovo = parte1+parte2;
        System.out.println("Texto concatenado de novo: "+textoNovo);
    }
}

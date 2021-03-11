import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] array= new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("introducir numeros array: "));
        }
        int pares = 0;
        int negativos = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] %2 ==0){
                pares = pares+1;
            }
            if (array[i]<0){
                negativos = negativos+1;
            }
        }
        System.out.println("Pares: "+pares+"\nNegativos: "+negativos);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Artigos art = new Artigos();
        Scanner sca = new Scanner(System.in);

        System.out.println("Introduce o número de vendas: ");
        int vendas = sca.nextInt();
        art.setVendas(vendas);
        art.verTipo();
    }
}

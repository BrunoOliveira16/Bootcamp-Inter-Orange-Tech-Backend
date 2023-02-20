import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int dinheiro = leitor.nextInt();
            int quantidadeDoces = 2;

            CalcularQuantidadeDoces(dinheiro, quantidadeDoces);
        }
    }

    public static void CalcularQuantidadeDoces(int dinheiro, int quantidadeDoces) {
        int totalDoces = dinheiro * quantidadeDoces;
        System.out.println("O cliente obteve " + totalDoces + " doces");
    }
}

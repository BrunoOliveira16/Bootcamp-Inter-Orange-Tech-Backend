import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Fatorial: ");
            int fatorial = leitor.nextInt();

            int multiplicacao = 1;

            System.out.print(fatorial + "! = ");
            for (int i = fatorial; i >= 1; i--) {
                multiplicacao = multiplicacao * i;
            }

            System.out.println(multiplicacao);
        }
    }

}

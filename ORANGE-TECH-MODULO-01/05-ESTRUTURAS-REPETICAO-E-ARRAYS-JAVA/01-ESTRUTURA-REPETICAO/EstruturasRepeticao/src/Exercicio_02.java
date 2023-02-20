import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            int nota;

            System.out.print("Nota: ");
            nota = leitor.nextInt();

            while (nota < 0 || nota > 10) {
                System.out.println("Nota Inválida! Digite novamente");
                nota = leitor.nextInt();
            }
        }

    }

}

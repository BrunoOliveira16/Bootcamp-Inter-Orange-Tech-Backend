import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            int numero;
            int maior = 0;
            float soma = 0;

            int count = 0;
            do {
                System.out.print("Numero: ");
                numero = leitor.nextInt();

                soma = soma + numero;

                if (numero > maior)
                    maior = numero;

                count = count + 1;
            } while (count < 5);

            System.out.println("O maior número digitado foi: " + maior);
            System.out.println("A média dos números digitados foi: " + (soma / 5));
        }
    }

}

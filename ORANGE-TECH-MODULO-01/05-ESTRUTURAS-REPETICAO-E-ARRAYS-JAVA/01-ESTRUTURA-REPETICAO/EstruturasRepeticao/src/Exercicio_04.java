import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            int numero;
            int numeroPar = 0;
            int numeroImpar = 0;

            int count = 0;
            do {
                System.out.print("Numero: ");
                numero = leitor.nextInt();

                if (numero % 2 == 0) {
                    numeroPar = numeroPar + 1;
                } else {
                    numeroImpar = numeroImpar + 1;
                }

                count = count + 1;
            } while (count < 5);

            System.out.println("O total de números pares foi de : " + numeroPar);

            System.out.println("O total de números impares foi de : " + numeroImpar);
        }

    }

}

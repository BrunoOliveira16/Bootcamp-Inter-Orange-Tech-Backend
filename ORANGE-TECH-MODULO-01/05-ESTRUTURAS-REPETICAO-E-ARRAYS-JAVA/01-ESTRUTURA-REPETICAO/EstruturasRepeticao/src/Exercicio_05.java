import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Tabuada: ");
            int tabuada = leitor.nextInt();

            System.out.println("Tabuada de " + tabuada);

            for (int i = 0; i <= 10; ++i) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
        }

    }

}

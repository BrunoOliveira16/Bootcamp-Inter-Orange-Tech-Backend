import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            String nome;
            int idade = 0;

            while (true) {

                System.out.print("Nome: ");
                nome = leitor.next();

                if (nome.equals("0"))
                    break;

                System.out.print("Idade: ");
                idade = leitor.nextInt();
            }

            System.out.println("Ultima idade informada foi " + idade + " anos");
            System.out.println("Finalizando a aplicação...");
        }

    }

}
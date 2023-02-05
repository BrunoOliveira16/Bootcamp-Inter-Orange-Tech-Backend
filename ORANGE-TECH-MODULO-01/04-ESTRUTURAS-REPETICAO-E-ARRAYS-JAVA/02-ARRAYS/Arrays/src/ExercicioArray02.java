import java.util.Scanner;

public class ExercicioArray02 {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            String[] letras = new String[6];
            int qntdConsoantes = 0;

            int count = 0;
            do {
                System.out.print("Letra: ");
                String letra = leitor.next();

                if (!(letra.equalsIgnoreCase("a") ||
                        letra.equalsIgnoreCase("e") ||
                        letra.equalsIgnoreCase("i") ||
                        letra.equalsIgnoreCase("o") ||
                        letra.equalsIgnoreCase("u"))) {
                    letras[count] = letra;
                    qntdConsoantes++;
                }

                count++;

            } while (count < letras.length);

            System.out.print("Consoantes do array: ");
            for (String letra : letras) {
                if (letra != null)
                    System.out.print(letra + " ");
            }
            System.out.println("\nQuantidade de consoantes: " + qntdConsoantes);
        }
    }
}

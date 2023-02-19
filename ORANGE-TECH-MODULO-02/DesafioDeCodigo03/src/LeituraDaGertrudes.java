import java.util.Scanner;

public class LeituraDaGertrudes {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int paginas = leitor.nextInt();
            int paginasLidas = 3;

            CalcularDiasDeLeitura(paginas, paginasLidas);
        }
    }

    public static void CalcularDiasDeLeitura(int paginas, int paginasLidas) {
        int totalDias = paginas / paginasLidas;
        System.out.println(totalDias + " dias");
    }
}

import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            int entrada = leitor.nextInt();
            int mesada = 50;

            calcularMesada(mesada, entrada);
        }
    }

    public static void calcularMesada(int mesada, int entrada) {
        int resultado = mesada * entrada;
        System.out.println("Você tera " + resultado + " reais");
    }
}

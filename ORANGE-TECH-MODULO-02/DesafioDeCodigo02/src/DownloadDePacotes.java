import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int tamanho = leitor.nextInt();

            PorcentagemDownload(tamanho);
        }
    }

    public static void PorcentagemDownload(int tamanho) {

        switch (tamanho) {
            case 1:
                System.out.println("/");
                break;
            case 2:
                System.out.println("//");
                break;
            case 3:
                System.out.println("///");
                break;
            case 4:
                System.out.println("////");
                break;
            case 5:
                System.out.println("/////");
                break;
            case 6:
                System.out.println("//////");
                break;
            case 7:
                System.out.println("///////");
                break;
            case 8:
                System.out.println("////////");
                break;
            case 9:
                System.out.println("/////////");
                break;
            case 10:
                System.out.println("//////////");
                break;
            default:
                System.out.println("Valor incorreto, digite um valor de 1 até 10.");
        }
    }
}
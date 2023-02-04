public class Exercicio04 {

    public static void main(String[] args) {

        semana();
        switchNumero();
        switchFerias();

    }

    private static void semana() {

        String diaSemana = "Segunda";

        switch (diaSemana) {
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 1;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    private static void switchFerias() {

        String mes = "Janeiro";

        switch (mes) {
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Não é Férias");
                break;
        }
    }
}

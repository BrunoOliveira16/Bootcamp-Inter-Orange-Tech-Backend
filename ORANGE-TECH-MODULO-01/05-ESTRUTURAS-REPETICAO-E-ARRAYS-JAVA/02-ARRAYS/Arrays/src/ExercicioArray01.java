public class ExercicioArray01 {
    public static void main(String[] args) {

        int[] vetor = { 0, 5, 3, 2, 1, 8 };

        System.out.print("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nVetor na ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nTamanho do Vetor: " + vetor.length);
    }
}

/*
 * OUTRA MANEIRA APRESENTADA COM O WHILE
 * int count = 0;
 * while (count < (vetor.length)) {
 * System.out.print(vetor[count] + " ");
 * count++;
 * }
 */
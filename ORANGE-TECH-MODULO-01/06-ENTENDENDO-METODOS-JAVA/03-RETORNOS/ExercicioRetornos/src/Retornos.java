public class Retornos {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercicio Retornos");
        double areaQuadrado = ExercicioRetornos.area(2);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = ExercicioRetornos.area(5d, 5d);
        System.out.println("Área do Retangulo: " + areaRetangulo);

        double areaTrapezio = ExercicioRetornos.area(8, 4, 10);
        System.out.println("Área do Trapezio: " + areaTrapezio);

        double areaLosango = ExercicioRetornos.area(5f, 5f);
        System.out.println("Área do Losango: " + areaLosango);

    }
}

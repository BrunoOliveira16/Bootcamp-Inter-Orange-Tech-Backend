public class ExecutarApp {

    public static void main(String[] args) {
        Carro04 carro4 = new Carro04();

        carro4.setCor("Azul");
        carro4.setModelo("BMW Série 3");
        carro4.setCapacidadeTanque(60);

        System.out.println(carro4.getModelo());
        System.out.println(carro4.getCor());
        System.out.println(carro4.getCapacidadeTanque());
        System.out.println(carro4.totalValorTanque(4.95));

        Carro04 carro5 = new Carro04("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro5.getModelo());
        System.out.println(carro5.getCor());
        System.out.println(carro5.getCapacidadeTanque());
        System.out.println(carro5.totalValorTanque(4.95));
    }
}

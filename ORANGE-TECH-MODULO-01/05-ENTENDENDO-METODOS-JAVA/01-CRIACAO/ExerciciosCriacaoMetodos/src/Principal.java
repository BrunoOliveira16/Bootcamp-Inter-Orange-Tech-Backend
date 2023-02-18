public class Principal {

    public static void main(String[] args) {

        // Exercicio 01
        System.out.println("Exercicio Calculadora");
        Exercicio01.somar(2, 2);
        Exercicio01.subtracao(8, 4);
        Exercicio01.multiplicacao(5, 5);
        Exercicio01.divisao(10, 5);

        // Exercicio 02
        System.out.println("Exercicio Mensagem");
        Exercicio02.obterMensagem(7);
        Exercicio02.obterMensagem(15);
        Exercicio02.obterMensagem(20);

        // Exercicio 03
        System.out.println("Exercicio Empréstimo");
        Exercicio03.calcular(1000, Exercicio03.getDuasParcelas());
        Exercicio03.calcular(1000, Exercicio03.getTresParcelas());
        Exercicio03.calcular(1000, 5);
    }
}

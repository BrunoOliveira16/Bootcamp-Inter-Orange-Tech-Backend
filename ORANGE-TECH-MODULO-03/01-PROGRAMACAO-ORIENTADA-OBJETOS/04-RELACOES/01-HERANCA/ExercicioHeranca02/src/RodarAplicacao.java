public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // DownCast Explicito
        // Vendedor vendedor_ = (Vendedor) new Funcionario();

        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(vendedor);
        System.out.println(faxineiro);
    }
}

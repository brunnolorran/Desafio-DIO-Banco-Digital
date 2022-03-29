public class Main {
    public static void main(String[] args) {

        // SImulação de clientes
        Cliente brunnolorran = new Cliente();
        brunnolorran.setNome("Brunno Lorran");

        Cliente osvaldocastro = new Cliente();
        osvaldocastro.setNome("Osvaldo");

        Conta cc1 = new ContaCorrente(brunnolorran);
        Conta poupanca1 = new ContaPoupanca(brunnolorran);

        Conta cc2 = new ContaCorrente(osvaldocastro);

        cc1.depositar(200);
        cc1.transferir(100, poupanca1);

        cc2.depositar(3000);
        cc2.transferir(1100, cc1);
        cc2.solicitarEmprestimo(5000);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        cc2.imprimirExtrato();

    }
}

public class Main {
    public static void main(String[] args) {

        Cliente brunnolorran = new Cliente();
        brunnolorran.setNome("Brunno Lorran");

        Conta cc = new ContaCorrente(brunnolorran);
        cc.depositar(200);
        Conta poupanca = new ContaPoupanca(brunnolorran);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}

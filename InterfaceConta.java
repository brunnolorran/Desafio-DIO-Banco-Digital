public interface InterfaceConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void solicitarEmprestimo(double valor);

    void imprimirExtrato();
}

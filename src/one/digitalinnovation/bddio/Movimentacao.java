package one.digitalinnovation.bddio;

public interface Movimentacao {

     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor,Conta contaDestino);

     void imprimirEtrato();

}

package one.digitalinnovation.bddio;

public class Main {

    public static void main(String[] args) {

      Correntista correntista = new Correntista();
      correntista.setNome("Fulano");
      correntista.setCPF("12566823566");
      correntista.setEmail("bbb@h.com");
      correntista.setTelefone("225693365");

      Conta corrente = new ContaCorrente(correntista);
      Conta poupanca = new ContaPoupanca(correntista);

      corrente.depositar(125);
      poupanca.depositar(5);

      corrente.transferir(25,poupanca);

      corrente.sacar(75);

      corrente.imprimirEtrato();
      poupanca.imprimirEtrato();



    }

}

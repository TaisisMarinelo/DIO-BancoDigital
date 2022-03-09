package one.digitalinnovation.bddio;

public class ContaCorrente extends Conta {


    public ContaCorrente(Correntista correntista) {
        super(correntista);
    }

    @Override
    public void imprimirEtrato() {
        System.out.println("------------------------------");
        System.out.println("=== Extrato Conta Corrente ===");
        super.extratoComum();
        System.out.println("------------------------------");

    }
}

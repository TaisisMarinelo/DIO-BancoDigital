package one.digitalinnovation.bddio;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Correntista correntista) {
        super(correntista);
    }

    @Override
    public void imprimirEtrato() {
        System.out.println("------------------------------");
        System.out.println("=== Extrato Conta Poupança ===");
        super.extratoComum();
        System.out.println("------------------------------");

    }



}

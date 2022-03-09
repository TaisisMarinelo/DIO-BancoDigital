package one.digitalinnovation.bddio;

public  abstract class Conta implements Movimentacao{

    private static final int AGENCIA_PADRAO = 1;
    private static final long serialVerSIONUID = 1L;

    protected int agencia;
    protected long numero;
    protected double saldo;
    protected Correntista correntista;

    public Conta(Correntista correntista){
        this.agencia = AGENCIA_PADRAO;
        this.numero = serialVerSIONUID;
        this.correntista = correntista ;
    }

    protected void extratoComum() {
        System.out.printf("Titular: %s%n", this.correntista.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }


    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }

    public Long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}

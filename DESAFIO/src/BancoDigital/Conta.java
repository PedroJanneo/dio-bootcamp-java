package BancoDigital;

public  abstract class Conta implements Iconta {

    private static int agenciaPadrao = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = Conta.agenciaPadrao;
        this.conta = sequencial++;
        this.cliente = cliente;
    }
    private static int sequencial =1;

    public Conta(){
        this.agencia = agenciaPadrao;
        this.conta =sequencial++;
    }

    public int getConta() {
        return conta;
    }


    public double getSaldo() {
        return saldo;
    }


    public int getAgencia() {
        return agencia;
    }


    @Override
    public void sacar(double valor) {
       this.saldo -= valor;

    }
    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }


    @Override
    public void transferir(Conta contaDestino, double valor) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }
    
    protected void imprimirInformacoes() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("agencia: " + this.agencia);
        System.out.println("conta: " + this.conta);
        System.out.println("saldo: " + this.saldo);
    }
   


   
}


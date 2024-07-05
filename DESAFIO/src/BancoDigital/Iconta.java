package BancoDigital;

public interface Iconta {


     void sacar(double saldo);

     void depositar(double saldo) ;

     void transferir(Conta contaDestino, double saldo) ;

     void imprimirExtrato();
}

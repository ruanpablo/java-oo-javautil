package bytebank_encapsulado;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

}

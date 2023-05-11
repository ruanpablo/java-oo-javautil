package bytebank_encapsulado;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
/*super(); super é inplicíto, se eu não fizer, o java faz implicitamente para mim. Mas apenas se tive o construtor
padrão na classe filha */

    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar); //se colocasse apenas saca() ou this.saca(), daria um erro pois o método chamaria a si mesmo
    }

    @Override
    public double getValorImpostos() {
        return super.saldo * 0.01;
    }

}

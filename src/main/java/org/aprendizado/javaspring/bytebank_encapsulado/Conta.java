package bytebank_encapsulado;

public abstract class Conta extends Object {
    protected double saldo; //não pode ser acessado a não ser pela própria classe
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; //esse é um atributo da classe conta, não de um objeto específico.
                                // static - mas compartilha com os objetos

    public Conta (int agencia, int numero) {
        Conta.total = Conta.getTotal() + 1;
//        System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
    }

//    é possível método static
//    dentro de um contexto estático não precisa do this
//    método static só usa atributo estático
    public static int getTotal() {
        return Conta.total;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    @Override
    public boolean equals(Object ref){
        Conta conta = (Conta) ref;//cast

        if (this.numero == conta.getNumero() && this.agencia == conta.getAgencia()){
            return true;
        }
        return false;
    } //toda Conta tem esse método de comparação

    @Override
    public String toString() {
        return "Conta{" +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }
    //println pega método toString da classe Object

}

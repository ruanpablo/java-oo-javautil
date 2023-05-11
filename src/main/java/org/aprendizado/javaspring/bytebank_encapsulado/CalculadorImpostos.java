package bytebank_encapsulado;

public class CalculadorImpostos {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImpostos();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}

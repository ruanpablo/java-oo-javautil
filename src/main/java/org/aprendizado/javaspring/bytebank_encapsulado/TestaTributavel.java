package bytebank_encapsulado;

public class TestaTributavel {
    public static void main(String[] args) {
        CalculadorImpostos calculador = new CalculadorImpostos();
        SeguroDeVida deVida = new SeguroDeVida();
        ContaCorrente cc = new ContaCorrente(2222, 65432);
        cc.deposita(1895);

        calculador.registra(deVida);
        calculador.registra(cc);

        System.out.println(calculador.getTotalImposto());
    }
}

package bytebank_encapsulado;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1122,65735);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(2244, 67534);
        cp.deposita(100.0);

        cc.transfere(10.0, cp);
        cc.saca(25);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}

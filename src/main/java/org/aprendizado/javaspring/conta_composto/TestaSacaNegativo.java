package conta_composto;

public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.deposita(100);
        System.out.println(conta.saca(100));
        System.out.println(conta.getSaldo());



    }
}

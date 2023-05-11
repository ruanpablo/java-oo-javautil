package array;

import bytebank_encapsulado.Conta;
import bytebank_encapsulado.ContaCorrente;
import bytebank_encapsulado.ContaPoupanca;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc = new ContaCorrente(22,87262);
        ContaPoupanca cp = new ContaPoupanca(23, 73653);

        guardador.adiciona(cc);
        guardador.adiciona(cp);

        int tamanho = guardador.getQuantidadeDeElementos();

        Conta ref = (Conta) guardador.get(1);//type cast

        System.out.println(tamanho);

        System.out.println(ref.getNumero());
    }
}

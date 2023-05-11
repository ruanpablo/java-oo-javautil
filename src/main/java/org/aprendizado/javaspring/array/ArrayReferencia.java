package array;

import bytebank_encapsulado.Cliente;
import bytebank_encapsulado.ContaCorrente;
import bytebank_encapsulado.ContaPoupanca;

public class ArrayReferencia {
    public static void main(String[] args) {
        Object [] referencias = new Object[5]; //array que pode guardar 5 referências

        ContaCorrente cc1 = new ContaCorrente(2222,12652);

        cc1 = (ContaCorrente) referencias[0]; //cria uma cópia do cc1 e aloca no array referencia contas

        ContaPoupanca cp1 = new ContaPoupanca(2541, 87236);

        Cliente cliente = new Cliente();
        referencias[2] = cliente;
//        System.out.println(cc1.getNumero());
        System.out.println(cp1.getNumero());
        System.out.println(cc1.getNumero());

//        ContaCorrente ref = contas[0]; //Não se pode referenciar objeto do tipo conta, com referênciasdo tipo CC ou CP. Sim do tipo Conta
//        Conta ref = contas[0];

        ContaCorrente ref = (ContaCorrente) referencias[1]; //assim não funciona. É necessário fazer um type cast de referência
    }
}

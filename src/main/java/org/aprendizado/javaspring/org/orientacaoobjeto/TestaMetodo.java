package org.orientacaoobjeto;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean retornoDoSaque = contaDoPaulo.saca(20);
        if(retornoDoSaque) {
            System.out.println("Valor sacado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println(contaDoPaulo.saldo);
        System.out.println(retornoDoSaque);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean retornoDaTransferencia =
                contaDaMarcela.transfere(3000, contaDoPaulo);

       if(retornoDaTransferencia){
           System.out.println("Transferência com sucesso");
       } else {
           System.out.println("Faltou dinheiro");
       };
        System.out.println("A conta do Paulo tem: " + contaDoPaulo.saldo);
        System.out.println("A conta da Marcela tem: " + contaDaMarcela.saldo);

        contaDoPaulo.titular = "Paulo Siqueira";
    }
}

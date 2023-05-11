package org.orientacaoobjeto;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da Primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        //A variável segunda conta recebe a referência primeira conta do tipo (Class-contém
        //os atributos do esboço conta - tipo é o esboço criado pela class) conta
        // vai copiar o número que referencia o endereço de memória do objeto conta
        //duas referências para o mesmo objeto tem sua utilização - duas cartas diferentes que se referenciam
        //ao mesmo lugar
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesmíssima conta!");
        }
        //só tem uma conta - um new, por isso o resultado é o mesmo

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}

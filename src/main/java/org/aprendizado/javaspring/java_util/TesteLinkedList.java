package java_util;

import bytebank_encapsulado.Conta;
import bytebank_encapsulado.ContaCorrente;
import bytebank_encapsulado.ContaPoupanca;

import java.util.LinkedList;
import java.util.List;

public class TesteLinkedList {

    public static void main(String[] args) {

//        <> isso é chamado de generics
        List<Conta> lista = new LinkedList<>(); //<Conta> na parte direita estava cinza, significando que não precisa ficar ali

        Conta cc1 = new ContaCorrente(22, 87332);
        Conta cp1 = new ContaPoupanca(23, 98262);

        lista.add(cc1);
        lista.add(cp1);

        Conta ref = lista.get(0);
        System.out.println("Tamanho " + lista.size());
        System.out.println(ref.getNumero());
        System.out.println(cc1.getNumero());

        lista.remove(0);
        System.out.println("Tamanho " + lista.size());

        ContaPoupanca cp2 = new ContaPoupanca(62, 63521);
        ContaCorrente cc3 = new ContaCorrente(233, 34554);

        lista.add(cp2);
        lista.add(cc3);

        /*i é variável de iteração - for é bom usar quando se deseja iterar uma lista por posição*/
        for (int i = 0; i < lista.size(); i++) {
            Conta refToString = lista.get(i);
            System.out.println(refToString); //o println usa o método toString da classe Object por baixo dos panos, ou outro método se houver sobescrita
        }
        System.out.println("---------------------");

        for (Conta oRef: lista) {
            System.out.println(oRef);
        } //foreach
    }
}
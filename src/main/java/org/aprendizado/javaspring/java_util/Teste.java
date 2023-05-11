package org.aprendizado.javaspring.java_util;

import org.aprendizado.javaspring.bytebank_encapsulado.Cliente;
import org.aprendizado.javaspring.bytebank_encapsulado.Conta;
import org.aprendizado.javaspring.bytebank_encapsulado.ContaCorrente;
import org.aprendizado.javaspring.bytebank_encapsulado.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacao {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

//        NumeroDaContaComparator comparator = new NumeroDaContaComparator();

        for(Conta conta: lista){
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        lista.sort(null);//passa ordem natural - mas não é boa prática

//        Collections.sort(lista, new NumeroDaContaComparator());
//        Collections.sort(lista);
//         Collections.reverse(lista);

        System.out.println("-----------------------------");

        for(Conta conta: lista){
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

    }
}

class TitularDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        return c1.getTitular().getNome().compareTo(c2.getTitular().getNome()); //método compareTo da classe string vai comparar os nomes e devolver o valor int correspondente
    }
}
//entre <> coloca-se tipo que se deseja comparar
class NumeroDaContaComparator implements Comparator<Conta> {
    //interface parametrizada - o T se tornou Conta
    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
//        return c1.getNumero() - c2.getNumero();

//        if (c1.getNumero() > c2.getNumero()) {
//            return 1;
//        } else if (c1.getNumero() < c2.getNumero()) {
//            return -1;
//        }
    }
}
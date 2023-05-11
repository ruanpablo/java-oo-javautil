package java_util;

import bytebank_encapsulado.Conta;
import bytebank_encapsulado.ContaCorrente;
import bytebank_encapsulado.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

//        <> isso é chamado de generics
        ArrayList<Conta> lista = new ArrayList<>(); //<Conta> na parte direita estava cinza, significando que não precisa ficar ali

        Conta cc1 = new ContaCorrente(22, 87332);
        Conta cp1 = new ContaPoupanca(23, 98262);
        Conta cp2 = new ContaPoupanca(23, 98262);
        lista.add(cc1);
        lista.add(cp1);

        //queremos que o contains use internamente esse método
        boolean contains = lista.contains(cp2); //método retorna boolean se contém ou não a referência
        System.out.println("Já existe? " + contains); //o método contains faz um laço pra verificar que a refência especificado existe
                                                        //o contains chama o equals da classe Object que nós sobscrevemos para colocarmos nossa regra de negócio

        for (Conta oRef: lista) {
            System.out.println(oRef);
        } //foreach
    }
}
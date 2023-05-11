package java_util;

import java.util.ArrayList;

public class ArrayListParâmetros {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList(26); //capacidade inicial
        lista.add("RJ");
        lista.add("SP");
        lista.add("MG");
    //outros estados
        ArrayList<String> nova = new ArrayList(lista); //criando baseado na primeira lista - já recebe tamanho e dados da primeira lista - clone - mas ainda assim
                                                        //é preciso declarar no generics o tipo de ArrayList, se não esse ArrayList inicializa como Object

        System.out.println(lista);
        System.out.println(nova);
    }
}

package java_util;

import java.util.Arrays;
import java.util.List;

public class ArrayEmList {
    public static void main(String[] args) {
        List<String> argumentos = Arrays.asList(args); //a parte direita transforma uma array em uma lista. Pode usufruir de  metodos da interface List
        argumentos.add("Vamo-nos");
        System.out.println(argumentos); //o asList (do java.util.Arrays) recebe como parâmetro um array, o transforma em uma lista e retorna uma Lista
                                        //return new ArrayList<>(a);
    }
}

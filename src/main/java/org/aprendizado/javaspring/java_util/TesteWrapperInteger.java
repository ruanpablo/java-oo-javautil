package java_util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29;//Integer

        Integer idadeRef = Integer.valueOf(29); //autoboxing

        int valor = idadeRef.intValue();//unboxing

        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);//constante
        System.out.println(Integer.BYTES);

        String diaComoTexto = "29";
        int dia = Integer.parseInt(diaComoTexto);//mais adequado, sem precisar fazer unboxing
        System.out.println("Dia como inteiros : " + dia);


        List<Integer> numeros = new ArrayList<Integer>();

        String s = args[0];//"10"

        //Integer numero = Integer.valueOf(s); //método sobrecarregado - transformar aquela String num inteiro - essas transformações chamam-se: parseInt

        int numero = Integer.parseInt(s);

        System.out.println(numero);

        numeros.add(29); //Autoboxing - faz internamente - do primitivo para a refrência
    }
}

package conta_composto;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Siqueira";
        paulo.cpf = "222-222-222-22";
        paulo.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        contaDoPaulo.titular = paulo; //essa linha compõe os objetos. -composição em orientação a objetos
        //a contaDoPaulo que é a referência para o objeto do tipo conta, recebeu em seu atributo tituto titular,
        //que é uma referência do tipo cliente, a referência do tipo Cliente paulo.

//        System.out.println(contaDoPaulo.titular); esse contaDoPaulo.titular tem apenas uma referência
        System.out.println(contaDoPaulo.titular);
        System.out.println(contaDoPaulo.titular.nome); //porque a referência contaDoPaulo entro no atributo
        //titular do objeto (.titular), esse que é uma referência também ao outro objeto do tiplo cliente, com o
        //.nome entrou nome do cliente.
        System.out.println(paulo);


    }
}

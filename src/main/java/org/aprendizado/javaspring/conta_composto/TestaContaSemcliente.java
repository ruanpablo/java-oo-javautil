package conta_composto;

public class TestaContaSemcliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.titular = new Cliente(); //já resolve o problema do titular não ser nulo. Na classe conta
                                                //o titular já é uma referência tipo Cliente,
                                                //por isso que o código compila
        contaDaMarcela.titular.nome = "Marcela";

        System.out.println(contaDaMarcela.titular.nome);
    }
}

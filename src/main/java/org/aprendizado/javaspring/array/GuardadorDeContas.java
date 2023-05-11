package array;

public class GuardadorDeContas {
    private Object[] referencias;
    private int posicao;

    public GuardadorDeContas(){
        referencias = new Object[10]; //máximo é 10 posições
    }

    public void adiciona(Object ref){
        this.referencias[posicao] = ref;
        this.posicao++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicao;
    }

    public Object get(int i) {
        return referencias[i];
    }

    public void remove(int i){
        referencias[i] = null;
    }
}

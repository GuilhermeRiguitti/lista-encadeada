public class Lista {
    private No cabeca;
    private No calda;

    public void lista() {
        this.cabeca = null;
        this.calda = null;
    }

    public void inserir(Produto produto) {
        No novoNo = new No();

        if (cabeca == null) {
            cabeca = novoNo;
            calda = novoNo;
        } else {
            novoNo.setAnterior(cabeca);
            calda.setProximo(novoNo);
            calda = novoNo;
        }
    }

    public void imprimir() {
        No atual = cabeca;

        while (atual != null) {
            System.out.println("Nome:" + atual.getProduto().getNome() + ", Valor:" + atual.getProduto().getValor());
            atual = atual.getProximo();
        }

    }
}
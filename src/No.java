public class No {
    private Produto produto;
    private No anterior;
    private No proximo;

    public void No(Produto produto){
        this.produto = produto;
        this.anterior = null;
        this.proximo = null;
    }

    //getters e setters

    public Produto getProduto(){
        return produto;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public No getAnterior(){
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProximo(){
        return proximo;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }


}
public class Ingrediente {
    int codigoProduto;
    String nome;
    int porcao;

    public Ingrediente(int codigoProduto, String nome, int porcao) {
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.porcao = porcao;
    }
    public String toString(){
        return codigoProduto + " - " + nome + " - " + porcao;
    }
}


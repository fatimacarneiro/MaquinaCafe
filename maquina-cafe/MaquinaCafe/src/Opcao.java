public class Opcao {
    int codigo;
    double valor;
    String descricao;

    public Opcao(int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return codigo + " - " + descricao + " R$ " + valor;
    }
}

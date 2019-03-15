import java.util.Scanner;

public class Cobranca {

    double valorInserido;
    double troco;

    public void cobra(Opcao opcaoEscolhida) {
        System.out.println("Para continuar a compra de seu " + opcaoEscolhida.descricao + ", insira o valor de R$ " + opcaoEscolhida.valor);
        Scanner pegaValor = new Scanner(System.in);
        valorInserido = pegaValor.nextDouble();

        if (valorInserido < opcaoEscolhida.valor) {
            System.out.println("Valor inserido inferior ao valor do produto. Retire seu valor de " + valorInserido + " e reinicie a compra.'");
            System.exit(1);
        } else if (valorInserido > opcaoEscolhida.valor) {
            troco = (valorInserido - opcaoEscolhida.valor);
            System.out.println("Valor inserido superior ao valor do produto. Retire seu troco de R$ " + troco);
        }

        System.out.println("Obrigada por comprar um " + opcaoEscolhida.descricao + ". Seu pedido  será prepado.");

    }
}

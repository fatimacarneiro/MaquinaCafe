import java.util.Scanner;

public class MaquinaCafe {
  public void maquinaCafe (){

      // ------------------------ AQUI COMEÇA A ESCOLHA DO USUÁRIO

      Menu menu = new Menu();
      menu.geraOpcoes();
      menu.mostraMenu();


    Scanner pedido = new Scanner(System.in);
        System.out.println("Olá! Para selecionar uma bebida, digite o número que antecede o nome do produto: ");
    int escolha = pedido.nextInt();

    //  VALIDAÇÃO

    Opcao opcaoEscolhida = null;

        if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5) {

        System.out.println("Opção inválida. Favor digitar o número que antecede o produto. Exemplo: para escolher Café, digite 1");


    } else {
        opcaoEscolhida = menu.escolherOpcao(escolha);
    }

    //------------------   ACABA PEDIDO
    NivelAcucar nivelAcucar = new NivelAcucar();
        nivelAcucar.alteraAcucar(escolha, opcaoEscolhida);
    // ----------------- COBRA
    Cobranca cobra = new Cobranca();
        cobra.cobra(opcaoEscolhida);


    // ----------------- PREPARO
    Pedido x = new Pedido();
        x.prepadaMostraEntregaPedido(opcaoEscolhida);
}

}

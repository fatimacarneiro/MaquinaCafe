import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Opcao opcaoCafe = new Opcao();
        opcaoCafe.descricao = "Café";
        opcaoCafe.valor = 1.0;
        opcaoCafe.codigo = 1;


        Opcao opcaoCafeComLeite = new Opcao();
        opcaoCafeComLeite.descricao = "Café com Leite";
        opcaoCafeComLeite.valor = 1.5;
        opcaoCafeComLeite.codigo = 2;

        Opcao opcaoCapuccino = new Opcao();
        opcaoCapuccino.descricao = "Capuccino";
        opcaoCapuccino.valor = 2.0;
        opcaoCapuccino.codigo = 3;

        Opcao opcaoCha = new Opcao();
        opcaoCha.descricao = "Chá";
        opcaoCha.valor = 1.0;
        opcaoCha.codigo = 4;

        Opcao opcaoAguaQuente = new Opcao();
        opcaoAguaQuente.descricao = "Água Quente";
        opcaoAguaQuente.valor = 0;
        opcaoAguaQuente.codigo = 5;

        // ------------------------ AQUI ACABA A PARTE DE EXIBIÇÃO


        System.out.println(opcaoCafe.codigo + " - " + opcaoCafe.descricao + " R$ " + opcaoCafe.valor);
        System.out.println(opcaoCafeComLeite.codigo + " - " + opcaoCafeComLeite.descricao + " R$ " + opcaoCafeComLeite.valor);
        System.out.println(opcaoCapuccino.codigo + " - " + opcaoCapuccino.descricao + " R$ " + opcaoCapuccino.valor);
        System.out.println(opcaoCha.codigo + " - " + opcaoCha.descricao + " R$ " + opcaoCha.valor);
        System.out.println(opcaoAguaQuente.codigo + " - " + opcaoAguaQuente.descricao + " R$ " + opcaoAguaQuente.valor);
        System.out.println();



        // ------------------------ AQUI COMEÇA A ESCOLHA DO USUÁRIO

            Scanner pedido = new Scanner(System.in);
            System.out.println("Olá! Para selecionar uma bebida, digite o número que antecede o nome do produto: ");
            int escolha = pedido.nextInt();

            //  VALIDAÇÃO

            Opcao opcaoEscolhida = null;

            if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5) {

                System.out.println("Opção inválida. Favor digitar o número que antecede o produto. Exemplo: para escolher Café, digite 1");


            } else {
                Menu menu = new Menu();
                menu.adicionarOpcao(opcaoCafeComLeite);
                menu.adicionarOpcao(opcaoAguaQuente);
                menu.adicionarOpcao(opcaoCapuccino);
                menu.adicionarOpcao(opcaoCha);
                menu.adicionarOpcao(opcaoCafe);


                opcaoEscolhida = menu.escolherOpcao(escolha);
            }

        //------------------   ACABA PEDIDO 
            NivelAcucar nivelAcucar = new NivelAcucar();
            nivelAcucar.alteraAcucar(escolha, opcaoEscolhida);
        // ----------------- COBRA

        double valorInserido;
        double troco;

        System.out.println("Para continuar a compra de seu "+ opcaoEscolhida.descricao + ", insira o valor de R$ " + opcaoEscolhida.valor);
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


        // ----------------- PREPARO

        switch (escolha){
            case 1:
                try {
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Passando a água no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açúcar...");}

                catch (InterruptedException erro){
                    System.out.println(erro);
                }
                break;

            case 2:
                try {
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Passando a água no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o leite no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açúcar...");

                }

                catch (InterruptedException erro){
                    System.out.println(erro);
                }
                break;
            case 3:
                try {
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Passando a água no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o leite...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o chocolate...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando a canela em pó...");
                    Thread.sleep(1000);
                    System.out.println("Misturando os ingredientes...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açúcar...");
                }
                catch (InterruptedException erro){
                    System.out.println(erro);
                }
                break;

            case 4:
                try {
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o chá na água...");
                    Thread.sleep(3000);
                    System.out.println("Aguarde...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o chá no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açúcar...");
                }
                catch (InterruptedException erro){
                    System.out.println(erro);
                }
                break;

            case 5:
                try {
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(2000);
                    System.out.println("Colocando a água quente no copo.");
                }

                catch (InterruptedException erro){
                    System.out.println(erro);
                }
                break;
        }

        System.out.println("\n" + "Retire seu " + opcaoEscolhida.descricao);

    }
}
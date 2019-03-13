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

        // ---------------- COMEÇA A PARTE DO AÇÚCAR
        if (escolha == 5){
            System.out.println("Você selecionou a opção " + opcaoEscolhida.descricao);
            if (opcaoEscolhida.valor == 0) {
                System.out.println("Essa opção é gratuita.");
                // mostra preparo
            }
        }
        int nivelAcucar = 3;

        if (escolha != 5) {
            System.out.println("Você escolheu " + opcaoEscolhida.descricao + ". O nível de açúcar da sua bebida é 3. Deseja alterar? Digite 1 para sim e 2 para não");
            Scanner mudaAcucar = new Scanner(System.in);
            int alteraAcucar = mudaAcucar.nextInt();

            if (alteraAcucar == 1) {
                System.out.println("Para alterar o nível de açúcar, digite um número de 0 a 5, sendo 0 zero açúcar e 5 o máximo de açúcar");
                Scanner quantidadeAcucar = new Scanner(System.in);
                nivelAcucar = quantidadeAcucar.nextInt();
                if (nivelAcucar >= 0 && nivelAcucar  <=5){
                    System.out.println("Você pediu um " + opcaoEscolhida.descricao + (" e o nível de açúcar dele é: " + nivelAcucar) );
                } else  {
                    System.out.println("Opção inválida. A bebida será feita com o nível de açúcar 3.");
                    nivelAcucar = 3;
                }


            } else {
                System.out.println("Você pediu um " + opcaoEscolhida.descricao + (" e o nível de açúcar dele é: " + nivelAcucar) );
            }

        } else {
            // return modo de preparo água.
        }

        // ----------------- COBRA

        double valorInserido;

        

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


    }
}
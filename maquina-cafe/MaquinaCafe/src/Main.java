import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

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

        System.out.println(opcaoCafe.codigo + " - " + opcaoCafe.descricao + " R$ " + opcaoCafe.valor);
        System.out.println(opcaoCafeComLeite.codigo + " - " + opcaoCafeComLeite.descricao + " R$ " + opcaoCafeComLeite.valor);
        System.out.println(opcaoCapuccino.codigo + " - " + opcaoCapuccino.descricao + " R$ " + opcaoCapuccino.valor);
        System.out.println(opcaoCha.codigo + " - " +  opcaoCha.descricao + " R$ " + opcaoCha.valor);
        System.out.println(opcaoAguaQuente.codigo + " - " + opcaoAguaQuente.descricao + " R$ " + opcaoAguaQuente.valor);
        System.out.println();

        // ------------------------ AQUI ACABA A PARTE DE EXIBIÇÃO

        // ------------------------ AQUI COMEÇA A ESCOLHA DO USUÁRIO
        Scanner pedido = new Scanner(System.in);
        System.out.println("Olá! Para selecionar uma bebida, digite o número que antecede o nome do produto: ");
        int escolha = pedido.nextInt();

        //  VALIDAÇÃO

        Opcao opcaoEscolhida = null;

        if (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5) {

            System.out.println("Opção inválida. Favor digitar o número que antecede o produto. Exemplo: para escolher Café, digite 1");


        }

        else {
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
        if (escolha != 5) {
            System.out.println("Você escolheu " + opcaoEscolhida.descricao + ". O nível de açúcar da sua bebida é 3. Deseja alterar?");
        } else {
            // return modo de preparo água.
        }




    }
}
public class Pedido {

    public void prepadaMostraEntregaPedido (Opcao opcaoEscolhida) {
        switch (opcaoEscolhida.codigo){
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

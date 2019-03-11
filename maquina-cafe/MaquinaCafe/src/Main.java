public class Main {

    public static void main(String[] args) {
        Opcoes opcaoCafe = new Opcoes();
        opcaoCafe.descricao = "Café";
        opcaoCafe.valor = 1;

        Opcoes opcaoCafeComLeite = new Opcoes();
        opcaoCafeComLeite.descricao = "Café com Leite";
        opcaoCafeComLeite.valor = 1.5;

        Opcoes opcaoCapuccino = new Opcoes();
        opcaoCapuccino.descricao = "Capuccino";
        opcaoCapuccino.valor = 2;

        Opcoes opcaoCha = new Opcoes();
        opcaoCha.descricao = "Chá";
        opcaoCha.valor = 1;

        Opcoes opcaoAguaQuente= new Opcoes();
        opcaoAguaQuente.descricao = "Água Quente";
        opcaoAguaQuente.valor = 0;

        System.out.println ("1 - " + opcaoCafe.descricao + " R$ " + opcaoCafe.valor);
        System.out.println ("2 - " + opcaoCafeComLeite.descricao + " R$ " + opcaoCafeComLeite.valor);
        System.out.println ("3 - " + opcaoCapuccino.descricao + " R$ " + opcaoCapuccino.valor);
        System.out.println ("4 - " + opcaoCha.descricao + " R$ " + opcaoCha.valor);
        System.out.println ("5 - " + opcaoAguaQuente.descricao + " R$ " + opcaoAguaQuente.valor);
        System.out.println ();
        System.out.println ("Olá! Escolha uma opção selecionando o número que antecede a descrição do item:);

    }
}

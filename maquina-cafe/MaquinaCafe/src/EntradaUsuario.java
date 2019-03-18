import java.util.Scanner;

public class EntradaUsuario {

    public void confereUsuario() {

        Estoque estoque = new Estoque();
        estoque.ingredientes();


        System.out.println("Olá! Você deseja fazer uma compra? Digite 1 para sim e 2 para não: ");
        int respostaUsuario;
        Scanner pegaRespostaUsuario = new Scanner(System.in);
        respostaUsuario = pegaRespostaUsuario.nextInt();

        if (respostaUsuario == 2) {
            System.out.println("\n" + "Para continuar, digite sua senha");
            int senha;
            Scanner pegaSenha = new Scanner(System.in);
            senha = pegaSenha.nextInt();

            if (senha == 1234567) {
                estoque.mostraEstoque();
            } else {
                System.out.println("\n" + "Senha incorreta! Redirecionando usuário para Menu de compras");
            }

        }

    }
}

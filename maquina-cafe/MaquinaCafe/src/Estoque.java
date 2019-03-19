import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public List<Ingrediente> ingredientes() {

        Ingrediente cafe = new Ingrediente(1, "Café", 5);
        ingredientes.add(cafe);

        Ingrediente leite = new Ingrediente(2, "Leite", 5);
        ingredientes.add(leite);

        Ingrediente chocolate = new Ingrediente(3, "Chocolate", 3);
        ingredientes.add(chocolate);

        Ingrediente limao = new Ingrediente(4, "Limão", 3);
        ingredientes.add(limao);

        Ingrediente acucar = new Ingrediente(5, "Açúcar", 100);
        ingredientes.add(acucar);

        Ingrediente copo = new Ingrediente(6, "Copo", 20);
        ingredientes.add(copo);

        return ingredientes;
    }


    public void mostraEstoque() {

        ingredientes();

        this.ingredientes.forEach(ingrediente -> {
            System.out.println("\n" + ingrediente.codigoProduto + " - " + ingrediente.nome + " - Contém " + ingrediente.porcao + " unidades.");
        });
    }

    int decisaoUsuario;

    public int querAlterarEstoque() {
        System.out.println("\n" + "Desejar adicionar ingredientes ao estoque? Digite 1 para sim e 2 para não.");
        Scanner desejaAlterar = new Scanner(System.in);
        decisaoUsuario = desejaAlterar.nextInt();

        return decisaoUsuario;
    }

//    public Estoque ligaDecisaoUsuarioAoCodigo(int decisaoUsuario, Ingrediente ingrediente) {
//
//        for (int i = 0; i < ingredientes.size(); i++) {
//
//            ingrediente = ingredientes.get(i);
//
//            if (ingrediente.codigoProduto == decisaoUsuario) {
//                decisaoUsuario = ingrediente.codigoProduto;
//            }
//
//        }
//        System.out.println(ingrediente.nome + ingrediente.codigoProduto + "esse é o produto");
//        return null;
//    }

    public void ligaDecisaoUsuarioAoCodigo(Ingrediente ingrediente) {
        for (int i = 0; i < ingredientes.size(); i++) {

            ingrediente = ingredientes.get(i);

            if (ingrediente.codigoProduto == decisaoUsuario) {
                decisaoUsuario = ingrediente.codigoProduto;
            }

        }
        System.out.println(ingrediente.nome + ingrediente.codigoProduto + "esse é o produto");
    }

    public void ligaDecisaoUsuarioAoCodigo() {
    }
}

//    public int alteraEstoque(Ingrediente ingrediente) {
//        if (decisaoUsuario == 1) {
//            System.out.println("\n" + "Digite o código do produto que deseja adicionar ao estoque");
//            Scanner produtoAlterado = new Scanner(System.in);
//            ingrediente.codigoProduto = produtoAlterado.nextInt();
//            System.out.println("\n" + "Você selecionou o código " + ingrediente.codigoProduto + "referente ao produto " + ingrediente.nome);
//
//
//            int pegaQuantidadeParaVerificar;
//            System.out.println("\n" + "Digite a quantidade de produto inserida");
//            Scanner alteraEstoque = new Scanner(System.in);
//            pegaQuantidadeParaVerificar = alteraEstoque.nextInt();
//
//            if (pegaQuantidadeParaVerificar > 0 && pegaQuantidadeParaVerificar < 100) {
//                ingrediente.porcao = pegaQuantidadeParaVerificar;
//            }
//
//        }
//        return ingrediente.porcao;
//    }




//    boolean prossegue;

//    public boolean confereEstoque() {
//
//        return prossegue;
//    }


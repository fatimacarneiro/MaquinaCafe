import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();

        public List<Ingrediente> ingredientes() {

            Ingrediente  cafe = new Ingrediente(1, "Café", 5);
            ingredientes.add(cafe);

            Ingrediente leite = new Ingrediente(2, "Leite", 5);
            ingredientes.add(leite);

            Ingrediente chocolate =  new Ingrediente(3, "Chocolate", 3);
            ingredientes.add(chocolate);

            Ingrediente limao =  new Ingrediente(4, "Limão", 3);
            ingredientes.add(limao);

            Ingrediente acucar =  new Ingrediente(5, "Açúcar", 100);
            ingredientes.add(acucar);

            Ingrediente copo =  new Ingrediente(6, "Copo", 20);
            ingredientes.add(copo);

            return ingredientes;
        }

        public void mostraEstoque(){
            this.ingredientes.forEach(ingrediente ->
            System.out.println("\n" + ingrediente.codigoProduto + " - " + ingrediente.nome + " - Contém " + ingrediente.porcao + " unidades."));

        }


        public void alteraEstoque(){
            System.out.println("\n" +  "Desejar adicionar ingredientes ao estoque? Digite 1 para sim e 2 para não.");
            int decisaoUsuario;
            Scanner alteraEstoque = new Scanner(System.in);
            decisaoUsuario = alteraEstoque.nextInt();

            if (decisaoUsuario == 2){
                System.out.println("\n" +  "Digite o número que antecede o produto para repor o mesmo");

            }
        }



//    boolean prossegue;
//
//    public boolean confereEstoque() {
//
//        return prossegue;
//    }
}

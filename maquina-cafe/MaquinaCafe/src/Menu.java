import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Opcao> listaOpcoes = new ArrayList<>();

    public String toString() {
        listaOpcoes.forEach((opcao) -> {
            System.out.println(opcao);
        });

        return "";
    }


    public void adicionarOpcao (Opcao opcaoEscolhida) {
        listaOpcoes.add(opcaoEscolhida);

    }
}




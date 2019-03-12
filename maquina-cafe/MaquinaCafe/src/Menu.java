import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Opcao> listaOpcoes = new ArrayList<>();

    public void adicionarOpcao(Opcao opcaoEscolhida) {
        listaOpcoes.add(opcaoEscolhida);
    }

    public Opcao escolherOpcao(int escolha) {

        for (int i = 0; i < listaOpcoes.size(); i++) {

            Opcao opcao = listaOpcoes.get(i);

            if(opcao.codigo == escolha){
                return  opcao;
            }

        }


        return null;
    }
}
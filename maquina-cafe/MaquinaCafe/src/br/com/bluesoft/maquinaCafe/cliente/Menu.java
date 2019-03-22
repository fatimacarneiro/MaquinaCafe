package br.com.bluesoft.maquinaCafe.cliente;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Opcao> opcoes = new ArrayList<>();

    public List<Opcao> geraOpcoes() {

        Opcao cafe = new Opcao(1, "Café", 1.0);
        opcoes.add(cafe);

        Opcao cafeComLeite = new Opcao(2, "Café com Leite", 1.5);
        opcoes.add(cafeComLeite);

        Opcao capuccino = new Opcao(3, "Capuccino", 2.0);
        opcoes.add(capuccino);

        Opcao cha = new Opcao(4, "Chá", 1.0);
        opcoes.add(cha);

        Opcao aguaQuente = new Opcao(5, "Água Quente", 0);
        opcoes.add(aguaQuente);

        return opcoes;
    }


    public void mostraMenu() {

        this.opcoes.forEach(opcao -> {
            System.out.println(opcao);
        });

        System.out.println();
    }


    public Opcao escolherOpcao(int escolha) {

        for (int i = 0; i < opcoes.size(); i++) {

            Opcao opcao = opcoes.get(i);

            if(opcao.codigo == escolha){
                return  opcao;
            }

        }


        return null;
    }
}
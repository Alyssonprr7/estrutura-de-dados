package com.alessandron3;


import com.alessandron3.model.ItemDuplo;

public class ListaDuplamenteEncadeada {
    public ItemDuplo primeiro;
    public ItemDuplo ultimo;
    public int quantidadeItens = 0;

    public ListaDuplamenteEncadeada(String[] dados) {
        for(String dado: dados) {
            adicionarItem(dado);
        }
    }

    public void adicionarItem(String dado) {
        //TODO implementar a funcao de adicionar um item na lista

    }

    public void removerItem(String dado) {
        //TODO Implementar funcao que remove item

    }


}

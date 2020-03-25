package com.alessandron3;

import com.alessandron3.model.Item;

public class ListaSimplesmenteEncadeada {
    public Item primeiro;
    public Item ultimo;
    public int quantidadeItens = 0;

    public ListaSimplesmenteEncadeada(String[] dados) {
        for(String dado: dados)
            this.adicionaItem(dado);
    }

    public void adicionaItem(String dado) {
    if(primeiro == null && ultimo == null){
        Item item = new Item(dado);
        primeiro = item;
        ultimo = item;
    }else {
        Item item = new Item(dado);
        ultimo.proximo = item; // Declarei que o meu item é o proximo
        ultimo = item; //Passei o meu item pro ultimo
        }
    }


    public void removerItem(String dado) {
        if(primeiro.equals(dado)){
            Item proximo = primeiro.proximo;
            primeiro = proximo;
        }else {
            Item aux = primeiro.proximo;
            Item anterior =primeiro;
            while(aux != null){
                if(aux.dado.equals(dado)){
                    anterior.proximo= aux.proximo;
                    ultimo = aux;
                    break;
                }
            anterior = aux;
            aux = aux.proximo;
            }
        }

    }

}

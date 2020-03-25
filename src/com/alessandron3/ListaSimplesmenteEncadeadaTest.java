package com.alessandron3;

import com.alessandron3.model.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaSimplesmenteEncadeadaTest {

    String[] dados = new String[] {"Java", "C++", "Python", "Kotlin", "NodeJs"};
    ListaSimplesmenteEncadeada lista;


    @Before
    public void setup() {
        lista = new ListaSimplesmenteEncadeada(dados);
    }

    @Test
    public void montaListaTest() {
        Assert.assertNotNull(lista.primeiro);

        String java = lista.primeiro.dado;
        Assert.assertNotNull(java);
        Assert.assertEquals("Java", java);

        String cplusplus = lista.primeiro.proximo.dado;
        Assert.assertNotNull(cplusplus);
        Assert.assertEquals("C++", cplusplus);

    }

    @Test
    public void adicionaItemTest() {
        String itemNovo = "php";

        lista.adicionaItem(itemNovo);
        Item item = lista.ultimo;

        Assert.assertNotNull(item);
        Assert.assertEquals("php", item.dado);
        Assert.assertNull(item.proximo);
    }


    @Test
    public void removerItemTest() {
        String itemRemovido = "NodeJs";

        lista.removerItem(itemRemovido);

        Item atual = lista.primeiro;

        do {
            Assert.assertFalse(atual.dado.equals(itemRemovido));
            atual = atual.proximo;
        } while (atual != null);

    }


}

package com.alessandron3;

import com.alessandron3.model.ItemDuplo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaDuplamenteEncadeadaTest {
    String[] dados = new String[] {"Java", "C++", "Python", "Kotlin", "NodeJs"};
    ListaDuplamenteEncadeada lista;

    @Before
    public void setup() {
        lista = new ListaDuplamenteEncadeada(dados);
    }

    @Test
    public void montarListaTest() {
        Assert.assertNotNull(lista.primeiro);
        Assert.assertNull(lista.primeiro.anterior);

        String java = lista.primeiro.dado;
        Assert.assertEquals("Java", java);

        String cplusplus = lista.primeiro.proximo.dado;
        Assert.assertEquals("C++", cplusplus);

        ItemDuplo nodeJs = lista.ultimo;
        Assert.assertEquals("NodeJs", nodeJs.dado);
        Assert.assertEquals("Kotlin", nodeJs.anterior.dado);

    }

    @Test
    public void adicionarItemTest() {
        String itemNovo = "php";

        lista.adicionarItem(itemNovo);
        ItemDuplo item = lista.ultimo;

        Assert.assertNotNull(item);
        Assert.assertEquals("php", item.dado);
        Assert.assertEquals("NodeJs", item.anterior.dado);
    }

    @Test
    public void removerItemTest() {

        String dado = "Python";
        lista.removerItem(dado);
        System.out.println(lista);
    }
}

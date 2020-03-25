package com.alessandron3;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    List<String> dados = new LinkedList<>();


    public void enqueue(String dado) {
        dados.add(dado);
    }

    public String dequeue() {
        return dados.remove(0);
    }

    public boolean isEmpty() {
        //TODO Implementar funcao para verificar e a fila esta vazia
        return false;
    }
}

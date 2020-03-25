package com.alessandron3.model;

public class ItemDuplo {
    public String dado;
    public ItemDuplo proximo;
    public ItemDuplo anterior;

    public ItemDuplo(String dado){
        this.dado = dado;
    }

    public ItemDuplo(){}

    @Override
    public String toString() {
        return "Dado: " + dado;
    }
}

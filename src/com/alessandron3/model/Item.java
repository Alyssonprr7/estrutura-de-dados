package com.alessandron3.model;

public class Item {
    public String dado;
    public Item proximo;


    public Item(String dado) {
        this.dado = dado;
    }

    public Item(){}

    @Override
    public String toString() {
        return "Dado: " + dado;
    }
}

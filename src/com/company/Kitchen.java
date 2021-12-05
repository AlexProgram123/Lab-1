package com.company;

public class Kitchen extends Forniture{
    private String locationInShop = "Location1";

    public String getLokaction() {
        return locationInShop;
    }

    public void getDescription() {
        System.out.println( "Наименование:" + getName() + "  Цена:"+ getPrice() +
                "   Склад:" + getLokaction());
    }
}

package com.company;

public class Forniture {
    private double price ;
    private String name ;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getDescription() {
        System.out.println("Name:" + getName() + "Price:" + getPrice() );
    }
}
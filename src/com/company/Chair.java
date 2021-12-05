package com.company;

public class Chair extends Kitchen{
    private double height ;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Chair (double a){
        height=a;
    }
    public void getDescription() {
        System.out.println( "Наименование:" + getName() + "  Цена:" + getPrice() + " руб" +
                "  Склад:" + getLokaction() + " Высота:" + getHeight() + " см");
    }
}

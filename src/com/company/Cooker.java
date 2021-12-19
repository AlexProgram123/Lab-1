package com.company;

public class Cooker extends Kitchen{
    private double Power ;
    public double getPower() {
        return Power;
    }
    public void setPower(double height) {
        this.Power = height;
    }
    public Cooker (double a){
        Power=a;
    }
    public void getDescription() {
        System.out.println( "Наименование:" + getName() + "  Цена:" + getPrice() + " руб" +
                "  Склад:" + getLokaction() + " Мощность:" + getPower() + " Вват");
    }
}

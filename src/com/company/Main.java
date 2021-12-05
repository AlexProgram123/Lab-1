package com.company;

public class Main {

    public static void main(String[] args) {
        int N = 6;
        Forniture[] allForniture = new Forniture[N];

        for(int i=0; i<allForniture.length; i++) {
            if(Math.random()<0.5) {
                allForniture[i] = new Chair(Math.ceil(Math.random() * 100));
                allForniture[i].setName("Стул №" + (i));
                allForniture[i].setPrice(Math.ceil(Math.random() * 1000));
            }
            else {
                allForniture[i] = new Cooker(Math.ceil(Math.random() * 10000));
                allForniture[i].setName("Плита №" + (i));
                allForniture[i].setPrice(Math.ceil(Math.random() * 10000));
            }
        }

        for(int i=1; i<allForniture.length; i++){
            allForniture[i].getDescription();
        }

    }
}

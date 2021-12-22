package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int bananaWeight = 400;
        System.out.println(bananaWeight);
        int milkWeight = 210;
        System.out.println(milkWeight);
        int icecreameWeight = 200;
        System.out.println(icecreameWeight);
        int eggWeight = 280;
        System.out.println(eggWeight);
        float generalWeight = bananaWeight + milkWeight + icecreameWeight + eggWeight;
        System.out.println("Общий вес спорт завтрака " + generalWeight + " грамм");
        System.out.println("Общий вес спорт завтрака " + generalWeight / 1000 + "кг");
    }
}

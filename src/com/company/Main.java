package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int bananaAmount = 400;
        System.out.println(bananaAmount);
        int milkAmount = 210;
        System.out.println(milkAmount);
        int icecreameAmount = 200;
        System.out.println(icecreameAmount);
        int eggAmount = 280;
        System.out.println(eggAmount);
        float generalAmount = bananaAmount + milkAmount + icecreameAmount + eggAmount;
        System.out.println("Общий вес спорт завтрака " + generalAmount + " грамм");
        System.out.println("Общий вес спорт завтрака " + generalAmount / 1000 + "кг");
    }
}

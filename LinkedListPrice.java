package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPrice {
    public static void main(String[] args) {
        LinkedList<Double> prices = new LinkedList<>();
        prices.add(22.33);
        prices.add(45.66);
        prices.add(33.55);
        prices.add(90.33);
        prices.add(87.00);
        prices.add(66.76);
        prices.add(49.00);

        Collections.sort(prices);
        System.out.println("Prices in ascending order " + prices);
    }
}

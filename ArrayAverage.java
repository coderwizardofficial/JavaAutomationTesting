package com.company;

public class ArrayAverage {
    public static void main(String[] args) {
        double prices[] = {100.6, 343.6, 43, 122};
        double total = 0;

        //for eacch loop
        for (double p : prices) {
            total = total + p;
        }
        System.out.println(total);
        double average = total / prices.length;
        System.out.println(average);

    }
}

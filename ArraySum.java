package com.company;

public class ArraySum {
    public static void main(String[] args) {
        int[] prices = {2, 40, 10};
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            //System.out.println(sum[i]);

            sum = sum + prices[i];
        }
        System.out.println(sum);
    }
}

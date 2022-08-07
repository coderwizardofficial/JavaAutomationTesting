package com.company;

import java.util.Scanner;

public class PriceByuserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter your Product price");
        double price = obj.nextDouble();

        if (price > 500) {
            System.out.println("Price is greater than 500");
        } else {
            System.out.println("Price is less than 500");
        }
    }
}

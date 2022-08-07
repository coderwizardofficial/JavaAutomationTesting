package com.company;

import java.util.Scanner;

public class ExceptionalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1st number");
            int num1 = sc.nextInt();
            System.out.println("2nd nume");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println("sum is : " + sum);
        } catch (Exception e) {
            System.out.println("Please enter only number");
        }
    }
}

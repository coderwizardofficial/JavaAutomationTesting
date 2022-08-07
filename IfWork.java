package com.company;

import java.util.Scanner;

public class IfWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        //using if else statement
        if (age >= 18) {
            System.out.println("You are voter");
        } else {
            System.out.println("You are Not voter");
        }

    }
}

package com.company;

import java.util.Scanner;

public class MultiByUserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter first floating number");
        float myFirstFloat = obj.nextFloat();
        System.out.println("Please Enter second floating number");
        float mySecondFloat = obj.nextFloat();
        float multi = myFirstFloat * mySecondFloat;
        System.out.println("Multiplication of two floating numbers : " + multi);
    }
}

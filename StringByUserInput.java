package com.company;

import java.util.Scanner;

public class StringByUserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter String value");
        String myString = obj.nextLine();
        System.out.println("My String value is " + myString);
    }
}

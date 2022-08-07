package com.company;

import java.util.Scanner;

public class IntegerByUserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter the integer number");
        int myNumber = obj.nextInt();
        System.out.println("My Integer Number is " + myNumber);
    }
}

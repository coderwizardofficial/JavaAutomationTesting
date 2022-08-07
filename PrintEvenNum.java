package com.company;

//write a program to print even numbers bet 50 and 100

public class PrintEvenNum {
    public static void main(String[] args) {

        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Print Even Numbers Between 50 and 100 Using for Loop :" + i);
            }
        }
    }
}

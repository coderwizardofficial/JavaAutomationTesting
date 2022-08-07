package com.company;

// WAP IN JAVA TO PRINT MULTIPLICATION TABLE OF EVEN NUMBER BETWEEN 50 - 100.

public class MultiEvenWork {
    public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            for (int j = 50; j <= 100; j++) {
                if (i * j % 2 == 0) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                //System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("################################");
        }

    }
}

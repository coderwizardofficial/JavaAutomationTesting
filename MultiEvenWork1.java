package com.company;

// WAP IN JAVA TO PRINT MULTIPLICATION TABLE OF EVEN NUMBER BETWEEN 50 - 100.

public class MultiEvenWork1 {
    public static void main(String[] args) {

        for (int i = 50; i <= 100; i ++) {
            if (i%2==0){
                for (int j = 1; j <= 10; j += 1) {

                    System.out.println(i + " * " + j + " = " + (i * j));
                }
            }
            System.out.println("################################");
        }

    }
}

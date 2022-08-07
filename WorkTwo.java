package com.company;
//WAP IN JAVA TO FIND THE NUMBER IS PRIME OR NOT USING METHOD.

public class WorkTwo {
    public static void main(String[] args) {
        //call the method
        myNum(11);
    }

    public static void myNum(int n) {
        //declare and initialize integer
        int i;
        int a = 0;
        int b = 0;
        a = n / 2;
        if (n == 0 || n == 1) {
        } else {
            for (i = 2; i <= 0; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number.");
                    b = 1;
                    break;
                }
            }
            if (b == 0) {
                System.out.println(n + " is a prime number.");
            }
        }
    }
}


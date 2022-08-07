package com.company;

//WAP IN JAVA TO PRINT EVEN NUMBER BETWEEN USING METHODS

public class WorkOne {
    public static void main(String[] args) {
        System.out.println("Even number from 10 to 20 is :");
        myNum(10, 20);
    }

    public static void myNum(int a, int b) {
        if (a > b)
            return;
        if (a % 2 == 0) {
            System.out.println(a);
            myNum(a + 2, b);
        }
    }
}

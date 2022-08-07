package com.company;

public class SwapTwoNum {
    public static void main(String[] args) {
        //Declare and initialize two values
        int x = 20;
        int y = 30;

        //Create temp value to swap the two values
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Value of x is " + x);
        System.out.println("Valeu of y is " + y);
    }
}

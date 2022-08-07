package com.company;
//this is example of parameter and return type

public class PaReturnType {
    public static void main(String[] args) {
        double total = myDoubleNum(10, 20);
        System.out.println(total);
    }

    public static double myDoubleNum(double a, double b) {
        double sum = a + b;
        return sum;
    }
}

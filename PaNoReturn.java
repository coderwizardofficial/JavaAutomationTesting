package com.company;

//This is example of parameter but No return type

public class PaNoReturn {
    public static void main(String[] args) {
        addNum(10, 30);
    }

    public static void addNum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }
}

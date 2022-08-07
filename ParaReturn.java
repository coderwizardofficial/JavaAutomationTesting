package com.company;

public class ParaReturn {
    public static void main(String[] args) {
        float total = num(30, 10);
        System.out.println(total);
    }

    public static float num(float a, float b) {
        float sum = a + b;
        return sum;
    }
}

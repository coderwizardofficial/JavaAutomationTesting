package com.company;

public class ParaReturnType {
    public static void main(String[] args) {
        int total = add(10, 30);
        System.out.println(total);
    }

    public static int add(int n1, int n2) {

        int sum = n1 + n2;
        return sum;
    }
}

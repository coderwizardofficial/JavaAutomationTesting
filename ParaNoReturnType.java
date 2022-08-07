package com.company;

public class ParaNoReturnType {
    public static void main(String[] args) {
        add(10, 20);
        add(40, 50);

    }

    public static void add(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println(sum);
    }
}

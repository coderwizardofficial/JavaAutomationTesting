package com.company;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}

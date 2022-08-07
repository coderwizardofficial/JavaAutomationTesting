package com.company;

public class WhileDemo2 {
    public static void main(String[] args) {

        for (int i=5;i<100;i++){
            if (i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}
package com.company;

//Generate Random Number Between 20 to 40

import java.lang.Math;

public class RandomDemo {
    public static void main(String[] args) {
        //need to get 20 to 40

        for (int i = 0; i <= 100; i++) {
            //(max-min+1)+min)
            System.out.println(Math.floor(Math.random() * (40 - 20 + 1) + 20));
        }
    }
}

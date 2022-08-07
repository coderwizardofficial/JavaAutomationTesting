package com.company;

public class Test {
    public static void main(String[] args) {
        System.out.println("Create object of car ");
        MyCar c1 = new MyCar();
        c1.brand = "Honda";
        c1.color = "white";
        c1.year = 2015;
        System.out.println(c1.brand);
        System.out.println(c1.color);
        System.out.println(c1.year);

        System.out.println("Create another object of car ");
        MyCar c2 = new MyCar();
        c2.year = 2019;
        c2.brand = "Hyundai";
        c2.color = "blue";
        System.out.println(c2.color);
        System.out.println(c2.brand);
        System.out.println(c2.year);


    }
}

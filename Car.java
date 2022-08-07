package com.company;

public class Car {
    public static void main(String[] args) {
        System.out.println("Create object of car ");
        CarInfo c1 = new CarInfo();
        c1.brand = "Toyota";
        c1.color = "white";
        c1.year = 2015;
        System.out.println(c1.brand);
        System.out.println(c1.color);
        System.out.println(c1.year);

        System.out.println("Create another object of car ");
        CarInfo c2 = new CarInfo();
        c2.year = 2019;
        c2.brand = "tesla";
        c2.color = "blue";
        System.out.println(c2.color);
        System.out.println(c2.brand);
        System.out.println(c2.year);
    }
}

class CarInfo {
    String color;
    String brand;
    int year;
}

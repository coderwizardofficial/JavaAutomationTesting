package com.company;

public class DemoOne {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        l1.name = "h";
        l1.ram = 123;

        l2.name = "b";
        l2.ram = 456;
        System.out.println(l1.ram);
        System.out.println(l1.ram);
        System.out.println(l2.ram);
        System.out.println(l2.name);

    }
}

class LaptopDemo {
    int ram;
    String name;

    void printDetails() {
        System.out.println(this.name);
        System.out.println(this.ram);
        System.out.println("\n-------");
    }
}
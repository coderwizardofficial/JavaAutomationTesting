package com.company;

public class HWOne {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();

        l1.id = 123;
        l1.name = "mac book";
        l1.ram = 345;

        System.out.println("Print for laptop 1");
        System.out.println(l1.id);
        System.out.println(l1.name);
        System.out.println(l1.ram);

        l2.id = 90;
        l2.name = "dell";
        l2.ram = 987;
        System.out.println("Print for laptop 2");
        System.out.println(l2.id);
        System.out.println(l2.name);
        System.out.println(l2.ram);

        l3.id = 567;
        l3.name = "lenevo";
        l3.ram = 541;
        System.out.println("Print for laptop 3");
        System.out.println(l3.id);
        System.out.println(l3.name);
        System.out.println(l3.ram);

    }
}

class Laptop {
    int id;
    String name;
    int ram;
}
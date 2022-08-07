package com.company;

public class BagWork {
    public static void main(String[] args) {
        Bag b1 = new Bag();
        b1.setPrice(234);
        b1.setName("hi");

        System.out.println(b1.getName());
        System.out.println(b1.getPrice());

    }
}

class Bag {

    String name;
    private double price;

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
package com.company;

public class AbstractionWork {
    public static void main(String[] args) {

        Hero t = new Hero();
        t.vehicleSound();
    }
}

abstract class Vehicle {

    abstract void vehicleSound();
}

class Hero extends Vehicle {

    void vehicleSound() {
        System.out.println("Hello hello");
    }
}
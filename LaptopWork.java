package com.company;

public class LaptopWork {
    public static void main(String[] args) {
        Apple ap = new Apple();
        ap.id = 234;
        ap.name = "Mabook";
        ap.model = 5;
        ap.isTouchId = false;
        ap.m1OrNot = true;

        // ap.printDetails();
        ap.printAll();
    }
}

class Laptopp {
    int id;
    int model;
    String name;

    void printAll() {
        System.out.println("Name is " + this.name);
        System.out.println("Id is " + this.id);
        System.out.println("Model is " + this.model);
    }
}

class Apple extends Laptopp {
    boolean isTouchId;
    boolean m1OrNot;

    void printAll() {
        System.out.println("Name is " + this.name);
        System.out.println("Id is " + this.id);
        System.out.println("Model is " + this.model);
        System.out.println("Touch Id is " + this.isTouchId);
        System.out.println("m1 or Not " + this.m1OrNot);
    }
}
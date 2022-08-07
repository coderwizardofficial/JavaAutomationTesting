package com.company;

public class CarDemo {
    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.id = 123;
        t.name = "Tesla One";
        t.model = "Model 3";
        t.isSelfDriving = true;
        t.showDetails();
    }
}

class CarWork {
    int id;
    String name;
    String model;

    //create method
    void showDetails() {
        System.out.println("Id is " + this.id);
        System.out.println("Name is " + this.name);
        System.out.println("Model is " + this.model);
    }

}

class Tesla extends CarWork {
    boolean isSelfDriving;
    void showDetails() {
        System.out.println("Id is " + this.id);
        System.out.println("Name is " + this.name);
        System.out.println("Model is " + this.model);
        System.out.println("Self Diving " + this.isSelfDriving);
    }
}
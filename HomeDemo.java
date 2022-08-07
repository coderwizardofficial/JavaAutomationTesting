package com.company;

public class HomeDemo {
    public static void main(String[] args) {
        Home h1 = new Home(23, 34, "hello");
        Home h2 = new Home(43, 345, "man");

        h1.printAll();
        h2.printAll();
    }
}

//declare class
class Home {
    int houseNo;
    String name;
    int zip;

    //declare constructors
    Home(int houseNo, int zip, String name) {
        this.houseNo = houseNo;
        this.name = name;
        this.zip = zip;
    }

    //use method
    void printAll() {
        System.out.println(this.houseNo);
        System.out.println(this.name);
        System.out.println(this.zip);
        System.out.println("\n-----------");
    }
}
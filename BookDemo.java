package com.company;

public class BookDemo {
    public static void main(String[] args) {
        BookInfo b1 = new BookInfo(123, "Algorithm", 230);
        BookInfo b2 = new BookInfo(345, "Cracking the Coding Interview", 85);
        b1.printBookDetails();
        b2.printBookDetails();
    }
}

//declare class
class BookInfo {
    int id;
    String name;
    int price;

    //constructors
    public BookInfo(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    //method
    void printBookDetails() {

        System.out.println("Print Book Id is " + this.id);
        System.out.println("Print Book name is " + this.name);
        System.out.println("Print Book price is " + this.price);
        System.out.println("\n---------------------------------");
    }
}
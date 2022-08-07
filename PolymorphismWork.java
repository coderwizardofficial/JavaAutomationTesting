package com.company;

public class PolymorphismWork {
    public static void main(String[] args) {
        Mic m = new Mic();
        Boya b = new Boya();

        m.printInfo();
        b.printInfo();
    }
}
class Mic {
    boolean isOn;
    String color;

    void printInfo() {
        System.out.println("This is default");
    }
}

class Boya extends Mic {
    void printInfo() {
        System.out.println("This is Boya info");
    }
}
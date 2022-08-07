package com.company;

public class InheritWork {
    public static void main(String[] args) {
        Dell d = new Dell();
        d.hardDisk = 123;
        d.id = 2;
        d.ram = 3;
        d.touchId = "L";

        d.printAll();

    }
}

class Computer {
    //properties
    int id;
    int hardDisk;
    int ram;
    String name;

    void printAll() {
        System.out.println(this.hardDisk);
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.ram);
    }
}

class Dell extends Computer {
    String touchId;

    void printAll() {
        System.out.println(this.hardDisk);
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.ram);
        System.out.println(this.touchId);
    }
}
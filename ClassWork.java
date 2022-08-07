package com.company;

// OOP

//enum Gender{Male, Female}

public class ClassWork {
    public static void main(String[] args) {
        //
        Dog g = new Dog();
        g.name = "johny";
        g.eyeColor = "red";
        g.age = 3;
        g.gender = "female";
        g.bread = "abc";

        Dog g1 = new Dog();
        g1.bread = "cvb";
        g1.age = 5;
        g1.name = "qwe";


        System.out.println(g.age);
        System.out.println(g.bread);

        System.out.println("G1 dog info is below");

        System.out.println("G1 dog info");
        System.out.println(g1.age);

    }
}

class Dog {
    //properties
    String name;
    String eyeColor;
    int age;
    String gender;
    String bread;

}
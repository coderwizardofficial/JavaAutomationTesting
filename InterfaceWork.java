package com.company;

public class InterfaceWork {
    public static void main(String[] args) {
        Human h = new Human();
        h.animalSound();

    }
}

interface Animal {

    void animalSound();

}

interface Homo {
    void animalSound();
}

class Human implements Animal, Homo {
    public void animalSound() {
        System.out.println("Hello");
    }
}

class Cow implements Animal {
    public void animalSound() {
        System.out.println("cow");
    }
}
class Dogs implements Animal {
    public void animalSound() {
        System.out.println("dog");
    }
}
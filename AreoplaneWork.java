package com.company;

public class AreoplaneWork {
    public static void main(String[] args) {

        Areoplane a1 = new Areoplane();
        a1.setColor("red");
        a1.setName("Qatar");

        //Print all information of areoplane
        System.out.println("color is :" + a1.getColor());
        System.out.println("Name is  :" + a1.getName());
    }
}

class Areoplane {

    //delcare the properties of areoplane
    private String name;
    private String color;

    //getter abd setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
package com.company;

/*
- WAP IN JAVA TO CREATE CLASS Planet with private properties
        [String name, boolean hasLife, double radius]
        - Create getter and setter for name, color, radius].
        - In the main method create an object of the Planet class.
        - Set name, color, radius
        - Print Plane Details [name, color, radius]
*/

public class PlanetWork {
    public static void main(String[] args) {
        Planet p = new Planet();
        p.setRadius(23.44);
        p.setName("Earth");
        p.setColor("red");

        System.out.println("Name is " + p.getName());
        System.out.println("Color is " + p.getColor());
        System.out.println("Radius is " + p.getRadius());
    }
}

class Planet {
    private boolean hasLife;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double radius;
    String color;
}

package com.company;

public class FindAreaOfCircle {
    public static void main(String[] args) {
        double detailsOfCircle = circleInfo(4.5);
        System.out.println(detailsOfCircle);
    }

    public static double circleInfo(double radius) {
        final double PI = 3.14;
        double areaOfCircle = PI * radius * radius;
        return areaOfCircle;
    }
}

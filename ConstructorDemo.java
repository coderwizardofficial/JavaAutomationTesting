package com.company;

public class ConstructorDemo {
    public static void main(String[] args) {
        Movie m1 = new Movie(123, "hello");
        Movie m2 = new Movie(345, "hello");

        m1.movieDetails();
        m2.movieDetails();
    }
}

class Movie {
    String name;
    int rate;

    //Declare constructors
    public Movie(int rate, String name) {
        this.rate = rate;
        this.name = name;

    }

    //Declare method
    void movieDetails() {
        System.out.println(this.name);
        System.out.println(this.rate);
    }
}
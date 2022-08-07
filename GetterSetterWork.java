package com.company;

public class GetterSetterWork {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.setName("rai");
        s.setRatings(3.3);

        System.out.println(s.getName());
        System.out.println(s.getRatings());
    }
}

class Sample {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    double ratings;


}

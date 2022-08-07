package com.company;

public class Student {
    private String name;
    private int id;

    Student(int id, String name){
        this.name=name;
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

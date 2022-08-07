package com.company;

public class JobTitle extends Job {
    double salary;

    void showMe() {
        System.out.println(this.id);
        System.out.println(this.position);
        System.out.println(this.salary);
    }
}

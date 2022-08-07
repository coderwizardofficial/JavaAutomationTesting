package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class DateWork {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your birthday");
        int ages = obj.nextInt();

        printBrthyear(ages);

    }

    public static void printBrthyear(int birthDay) {
        LocalDate d = LocalDate.now();
        int currentYear = d.getYear();
        int age = currentYear - birthDay;
        System.out.println("Age is:" + age);
    }
}
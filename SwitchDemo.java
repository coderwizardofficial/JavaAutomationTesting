package com.company;

public class SwitchDemo {
    public static void main(String[] args) {
        //Declare and initialize number of month
        int noOfMonth = 12;

        //Implement of switch statement
        switch (noOfMonth) {
            case 1:
                System.out.println("Month is Jan");
                break;
            case 2:
                System.out.println("Month is Feb");
                break;
            case 3:
                System.out.println("Month is march");
                break;
            case 4:
                System.out.println("month is april");
                break;
            case 5:
                System.out.println("month is may");
                break;
            case 6:
                System.out.println("month is june");
                break;
            case 7:
                System.out.println("month is july");
                break;
            case 8:
                System.out.println("month is august");
                break;
            case 9:
                System.out.println("month is sep");
                break;
            case 10:
                System.out.println("month is octo");
                break;
            case 11:
                System.out.println("month is nov");
                break;
            case 12:
                System.out.println("month is dec");
                break;
            default:
                System.out.println("Invalid Month");

        }
    }
}

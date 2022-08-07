package com.company;

import java.util.Scanner;

public class WitchCaseCal {
    public static void main(String[] args) {
        char op;
        double num1;
        double num2;
        double calculate;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Choose Op +, -, *, /");
        op = sc.next().charAt(0);
        System.out.println("Enter num");
        num1 = sc.nextDouble();
        System.out.println("Please second num");
        num2 = sc.nextDouble();

        switch (op) {
            case '+':
                calculate = num1 + num2;
                System.out.println(calculate);
                break;
            case '-':
                calculate = num1 + num2;
                System.out.println(calculate);
        }

    }
}

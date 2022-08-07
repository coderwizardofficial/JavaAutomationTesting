package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name ");

        int totalArray = sc.nextInt();
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < totalArray; i++) {
            String value = sc1.nextLine();
            list.add(value);
        }
        System.out.println("all value is");
        for (String Item : list) {
            System.out.println(Item);
        }


    }
}

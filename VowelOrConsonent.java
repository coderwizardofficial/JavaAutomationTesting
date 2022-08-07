package com.company;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter char");
        String name = sc.nextLine();

        char mychar = name.charAt(0);

        if (mychar == 'a' || mychar == 'e' || mychar == 'i' || mychar == 'o' || mychar == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("Consonent");
        }
    }
}

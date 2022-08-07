package com.company;

import java.io.File;

public class FileWork {
    public static void main(String[] args) {
        try {
            File f = new File("contact.csv");
            if (f.createNewFile()) {
                System.out.println("Contact.csv created");
            } else {
                System.out.println("Contact.csv already created");
            }
        } catch (Exception e) {
            System.out.println("Exception handling");
        }
    }
}

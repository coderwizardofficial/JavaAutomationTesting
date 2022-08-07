package com.company;

import java.io.FileWriter;

public class FileWriteWork {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("contact.csv");
            fw.write("I am writing");
            fw.close();
            System.out.println("File writes");
        } catch (Exception e) {
            System.out.println("went wrong");
        }
    }
}

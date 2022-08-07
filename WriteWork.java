package com.company;

//Write your name to file called name.txt

import java.io.File;
import java.io.FileWriter;

public class WriteWork {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("name.txt", true);
            fw.write("Pramod Rai");
            fw.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}

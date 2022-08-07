package com.company;

import java.io.File;

public class CreateNewFile {
    public static void main(String[] args) {
        try {
            File f = new File("names.txt");
            if (f.createNewFile()) {
                System.out.println("File created ");
            } else {
                System.out.println("File already created");
            }
        } catch (Exception e) {

        }


    }
}

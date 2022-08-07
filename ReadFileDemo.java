package com.company;

//hw

import java.io.File;
import java.util.Scanner;

public class ReadFileDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("names.txt");
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            String mydata = reader.nextLine();
            System.out.println(mydata);
            System.out.println(mydata);
        }
        reader.close();
    }
}

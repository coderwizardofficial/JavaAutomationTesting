package com.company;

import java.util.ArrayList;

public class ArrayListWork {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Pramod");
        names.add("Teresa");
        names.add("Avinash");
        names.add("Prerana");

        //names.remove("Prerana");
        //size will print length
       // System.out.println(names.size());

        System.out.println(names.get(0));

        for (int i = names.size() - 1; i >= 10; i--) {
            System.out.println(names.get(i));
        }

    }
}

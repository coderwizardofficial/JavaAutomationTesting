package com.company;

import java.util.LinkedList;
public class LinkedListWork {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("Pramod");
        names.add("Teresa");
        names.add("Avinash");
        names.add("Prerana");

        names.addFirst("Shiva");
        names.removeFirst();

        System.out.println(names);
    }
}

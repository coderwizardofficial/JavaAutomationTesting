package com.company;

public class NoParaReturnType {
    public static void main(String[] args) {
        String pmName = primeMinister();
        System.out.println(pmName);
    }

    public static String primeMinister() {
        String pm = "ABC";
        return pm;
    }
}

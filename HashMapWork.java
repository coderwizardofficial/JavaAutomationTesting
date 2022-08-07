package com.company;

import java.util.HashMap;

public class HashMapWork {
    public static void main(String[] args) {
        HashMap<String, Double> productDetails = new HashMap<String, Double>();
        productDetails.put("Sam", 440.55);
        productDetails.put("apple", 990.33);
        productDetails.put("mee", 64.44);
        System.out.println(productDetails.get("Sam"));

        productDetails.remove("apple");
        System.out.println(productDetails);

        for (String i : productDetails.keySet()) {
            System.out.println(i);
        }


    }
}

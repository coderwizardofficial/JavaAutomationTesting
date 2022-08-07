package com.company;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> countryInfos = new HashMap<String, String>();
        countryInfos.put("Nepal", "Kathmandu");
        countryInfos.put("USA", "washington");
        countryInfos.put("India", "Delhi");
        countryInfos.put("Pakistan", "Karachi");
        countryInfos.put("China", "Beijing");

        System.out.println(countryInfos);


        for (String country : countryInfos.keySet()) {
            System.out.println("Capital city of " + country + " is " + countryInfos.get(country));
        }
    }
}

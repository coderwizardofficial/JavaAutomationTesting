package com.company;

public class CalculateOfSimpleInt {
    public static void main(String[] args) {
        float myPrincipal = 100f;
        float myTime = 3.4f;
        float myRate= 2.1f;
        float simpleInt = (myRate*myTime*myPrincipal)/100;

        System.out.println("Simpel Int is "+ simpleInt);
    }
}

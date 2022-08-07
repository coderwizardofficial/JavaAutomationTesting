package com.company;

public class ArrayEven {
    public static void main(String[] args) {
        //declare array of numbers
        int[] evenNums = {2, 34, 4, 50,99};
        //using for loop
        for (int i = 0; i < evenNums.length; i++) {
            //check the num is even number
            if (evenNums[i] % 2 == 0) {
                System.out.println(evenNums[i]);
            }
        }

    }
}

package com.rays.javabasic;

public class SecondLargest {
    public static void main(String[] args) {

        int[] intArray = { 23, 54, 32, 98, 86 };
        int largest = intArray[0];
        int secondLargest = intArray[0];

        for(int i: intArray) {
            if (i > largest){
                largest = i;
            }
            if (i < largest && i > secondLargest){
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);

    }
}

package com.rays.javabasic;

public class SecondLargest {
    public static void main(String[] args) {

        int[] intArray = { 230, 54, 32, 98, 86 };
        int largest = 0;
        int secondLargest = 0;

        for(int i: intArray) {
            if (i > largest){
//                secondLargest = largest;
                largest = i;
            }
            else if (i < largest && i > secondLargest){
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);

    }
}

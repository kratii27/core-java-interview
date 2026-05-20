package com.rays.javabasic;

public class LargestNum {
    public static void main(String[] args) {

        int[] intArray = { 23, 54, 32, 98, 86 };
        int largest = intArray[0];

        for(int i: intArray) {
            if (i > largest){
                largest = i;
            }
        }
        System.out.println(largest);

    }
}

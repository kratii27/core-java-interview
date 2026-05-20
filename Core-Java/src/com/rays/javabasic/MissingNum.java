package com.rays.javabasic;

public class MissingNum {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 2, 3, 4};

        int sumA = 0;
        int sumB = 0;

        for (int i: a){
            sumA = sumA + i;
        }

        for (int i: b){
            sumB = sumB + i;
        }

        System.out.println("missing num: " + (sumA - sumB));
    }
}

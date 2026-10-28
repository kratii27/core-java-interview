package com.rays.javabasic;

public class SecongHighest {

    public static int secondHighest(int[] intArray){
        int highest = 0;
        int secondHighest = 0;

        for (int i : intArray) {
            if (highest < i) {
                secondHighest = highest;
                highest = i;
            }
            if (i < highest && secondHighest < i) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] intArray = {10, 5, 20, 20, 8};
        int ans = secondHighest(intArray);
        System.out.println(ans);
    }

}

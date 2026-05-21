package com.rays.javabasic;

public class FindingPositionMethod {
    public static int index(int[] intArray, int num){
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] intArray = { 1, 4, 6, 2, 9 };
        int num = 7;

        int index = index(intArray, num);
        System.out.println(index);
    }
}

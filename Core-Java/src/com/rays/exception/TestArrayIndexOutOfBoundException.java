package com.rays.exception;

public class TestArrayIndexOutOfBoundException {

    public static void main(String[] args) {
        try {
            int[] ar = { 1, 2 , 3, 4};
            System.out.println(ar[5]);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
package com.rays.javabasic;

public class RandomNum {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            int random = (int)((Math.random() * 101) + 100);

            System.out.println(random);
        }
    }
}
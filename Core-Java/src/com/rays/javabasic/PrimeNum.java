package com.rays.javabasic;

public class PrimeNum {

    public static void main(String[] args) {

        int num = 9;
        boolean isPrime = true;

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("it is prime number");
        } else {
            System.out.println("it is not prime number");
        }

    }
}

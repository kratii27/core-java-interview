package com.rays.javabasic;

public class Palindrome {

    public static void main(String[] args) {

        int num = 121;
        int temp = num;
        int rev = 0;
        int r = 0;

        while (temp > 0){
            r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }

        if (rev == num){
            System.out.println("yes, it is palindrome");
        } else {
            System.out.println("no, it is not palindrome");
        }
    }

}

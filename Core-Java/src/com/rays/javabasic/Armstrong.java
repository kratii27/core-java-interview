package com.rays.javabasic;

public class Armstrong {
    public static void main(String[] args) {

        int num = 153;
        int temp = num;
        int r = 0;
        int sum = 0;

        while (temp > 0){
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        System.out.println(sum);

        if (num == sum){
            System.out.println("yes, it is armstrong number");
        } else {
            System.out.println("no, it is not armstrong number");
        }

    }
}

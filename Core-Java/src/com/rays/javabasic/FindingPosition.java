package com.rays.javabasic;


import java.util.Scanner;

public class FindingPosition {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int position = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = sc.nextInt();

        for (int i = 0; i < a.length; i++){
            if (a[i] == num){
                position = i;
            }
        }
        System.out.println(position);
    }

}

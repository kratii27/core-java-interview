package com.rays.javabasic;

public class MissingNum {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5, 8};
        int [] b = {1, 2, 3, 4};

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("missing num: " + a[i]);
            }
        }

    }
}

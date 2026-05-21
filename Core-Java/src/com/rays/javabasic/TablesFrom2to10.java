package com.rays.javabasic;

public class TablesFrom2to10 {
    public static void main(String[] args) {

        int[][] a = new int[9][10];


        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 10; j++){
                a[i][j] = (i + 2) * (j + 1);
                System.out.print((i + 2) + " * " + (j + 1) + " = " + a[i][j] + "\t");
            }
            System.out.println();
        }


    }
}

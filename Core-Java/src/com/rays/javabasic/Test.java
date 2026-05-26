package com.rays.javabasic;

public class Test {
    public static void main(String[] args) {

        String str = "harry james potter";
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (count == 0){
                System.out.print(ch);
            }
            count = 0;
        }

    }
}

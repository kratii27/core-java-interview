package com.rays.string;

public class DoNotRepeat {

    public static void main(String[] args) {

        String str = "harry";
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            int j = 0;

            for (j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }

            if (j == i) {
                newStr += str.charAt(i);
            }
        }

        System.out.println(newStr); 
    }
}
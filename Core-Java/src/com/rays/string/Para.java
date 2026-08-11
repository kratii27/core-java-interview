package com.rays.string;
public class Para {

    public static void main(String[] args) {
        
        String para = "hi i am krati";
        String[] words = para.split(" ");
        String largest = words[0];

        for (String word : words) {
            if (word.length() > largest.length() ) {
                largest = word;
            }
        }
        System.out.println("Largest word: " + largest);



    }
}
package com.rays.javabasic;

public class NotesCount {
    public static void main(String[] args) {

        int[] notes = { 500, 200, 100 };
        int money= 87400;
        int count = 0;

        for (int note: notes) {
            count = money / note;
            System.out.println(note + " count: " + count);
            money = money % note;
        }

    }
}

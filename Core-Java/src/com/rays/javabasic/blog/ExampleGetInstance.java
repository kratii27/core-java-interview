package com.rays.javabasic.blog;

import java.util.Calendar;

public class ExampleGetInstance {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Object created using factory method: " + calendar.getTime());
    }
}
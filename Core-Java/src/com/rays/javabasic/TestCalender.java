package com.rays.javabasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalender {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar c = Calendar.getInstance();

        for (int i = 1; i <= 12; i++){
            c.add(Calendar.DATE, 30);
            System.out.println(sdf.format(c.getTime()));
        }
    }
}

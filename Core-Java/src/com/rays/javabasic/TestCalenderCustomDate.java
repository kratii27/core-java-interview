package com.rays.javabasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalenderCustomDate {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = sdf.parse("2025/09/27");
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        System.out.println(sdf.format(c.getTime()));
        for (int i = 1; i <= 12; i++){
            c.add(Calendar.DATE, 30);
            System.out.println(sdf.format(c.getTime()));
        }
    }

}

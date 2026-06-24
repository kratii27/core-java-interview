package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class CountAge {
    public static void main(String[] args) {

       LocalDate now = LocalDate.now();
       LocalDate dob = LocalDate.of(2002, 9, 27);
       Period age = Period.between(dob, now);
        System.out.println(age.getYears());
    }
}

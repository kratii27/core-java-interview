package com.rays.javabasic.java8;

import java.util.ArrayList;

public class TestForeach {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.forEach(l -> System.out.println(l));

    }

}

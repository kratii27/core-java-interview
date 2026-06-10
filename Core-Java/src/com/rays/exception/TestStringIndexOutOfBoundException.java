package com.rays.exception;

public class TestStringIndexOutOfBoundException {
    public static void main(String[] args) {

        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}

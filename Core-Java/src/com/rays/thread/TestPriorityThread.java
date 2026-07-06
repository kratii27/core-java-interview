package com.rays.thread;

public class TestPriorityThread {

    public static void main(String[] args) {
        
        PriorityThread p1 = new PriorityThread("abc");
        PriorityThread p2 = new PriorityThread("abc");

        p1.setPriority(2);
        p2.setPriority(10);

        p1.start();
        p2.start();

    }

}

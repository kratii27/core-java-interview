package com.rays.thread;

public class TestJoinWithThread {

    public static void main(String[] args) {
        
        JoinThread j1 = new JoinThread("abc");
        JoinThread j2 = new JoinThread("xyz");

        j1.start();

        try {
            j1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j2.start();

    }

}

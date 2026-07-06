package com.rays.thread;

public class TestRacing {

    public static void main(String[] args) {
        
        RacingCondition r1 = new RacingCondition("abc");
        RacingCondition r2 = new RacingCondition("xyz");

        r1.start();
        r2.start();

    }

}

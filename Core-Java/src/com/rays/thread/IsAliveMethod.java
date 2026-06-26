package com.rays.thread;

public class IsAliveMethod extends Thread{

    @Override
    public void run() {
        System.out.println("method is alive");
    }

    public static void main(String[] args) {
        IsAliveMethod a1 = new IsAliveMethod();
        IsAliveMethod a2 = new IsAliveMethod();

        System.out.println(a1.isAlive());
        a1.start();
        System.out.println(a1.isAlive());
        System.out.println(a2.isAlive());
        a2.start();
        System.out.println(a2.isAlive());
    }

}

package com.rays.thread;

public class RacingCondition extends Thread {

    public String name;

    static Account ac = new Account();

    public RacingCondition(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
			ac.deposite(name, 1000);
		}
    }

}

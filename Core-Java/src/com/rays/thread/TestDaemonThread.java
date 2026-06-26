package com.rays.thread;

public class TestDaemonThread {

    public static void main(String[] args) {
        
        BackgroundThread th = new BackgroundThread("daemon thread");

        th.setDaemon(true);
        th.start();

        for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(i + " main");
		}

    }

}

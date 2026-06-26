package com.rays.thread;

public class BackgroundThread extends Thread{

    public String name;

    public BackgroundThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }

}

package com;

public class MyRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println("Runnable Started");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runnable finished");
    }
}

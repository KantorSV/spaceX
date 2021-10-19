package com;

public class MyThread extends Thread{

    public void run(){

        System.out.println("Extends Thread Start");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Extends Thread Finish");
    }
}

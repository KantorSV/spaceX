package com.app;

public class MyThread extends Thread {

    public void run(){
        System.out.println("-----------Extends thread START------------------");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("-----------Extends thread END------------------");
    }
}

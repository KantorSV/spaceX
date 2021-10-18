package com.app;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread with Runnable started!!");

        try {
            Thread.sleep(5 * 1000);
        }catch(Exception ex){
            ex.printStackTrace();
        }


        System.out.println("Thread with Runnable finished!!");
    }
}

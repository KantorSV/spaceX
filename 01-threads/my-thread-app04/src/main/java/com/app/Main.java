package com.app;

public class Main {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread t = new Thread(myRunnable);
        System.out.println(t);
        t.start();


        MyThread myThread = new MyThread();
        myThread.start();



    }


}

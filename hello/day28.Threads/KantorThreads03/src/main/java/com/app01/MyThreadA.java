package com.app01;

public class MyThreadA extends Thread {

    public void run() {

        System.out.println("Thread Start");
        while (true) {
            System.out.println(Thread.currentThread());
        }
    }

}

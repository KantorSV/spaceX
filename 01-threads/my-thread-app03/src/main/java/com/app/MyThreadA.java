package com.app;

public class MyThreadA extends Thread {

    public void run(){
        System.out.println("THREAD START");
        while(true){
            //System.out.println(Thread.currentThread().isDaemon());
            System.out.println(Thread.currentThread());


        }
    }

}

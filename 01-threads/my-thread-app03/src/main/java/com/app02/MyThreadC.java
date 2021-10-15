package com.app02;

public class MyThreadC extends Thread {
    private int value;

    public void run(){
        while(true){
            value++;
            System.out.println("ThreadC="+value);
        }
    }
}

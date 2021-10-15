package com.app02;

public class MyThreadB extends Thread {
    private int counter;


    public void run() {
        while (true) {
            counter++;
            System.out.println("\tThreadB=" + counter);
        }
    }

}

package com.app02;

public class MyThreadC extends Thread {
    private int counter;

    public void run() {

        while (true) {
            counter++;
            System.out.println("C" + counter);
        }
    }
}

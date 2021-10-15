package com.app02;

public class Main {

    public static void main(String[] args) {
        MyThreadB myThreadB = new MyThreadB();
        MyThreadC myThreadC = new MyThreadC();

        myThreadB.setPriority(Thread.MAX_PRIORITY);
        myThreadC.setPriority(8);

        myThreadC.start();
        myThreadB.start();

    }
}

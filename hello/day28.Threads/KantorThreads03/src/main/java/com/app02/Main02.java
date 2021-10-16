package com.app02;

public class Main02 {

    public static void main(String[] args) {

        MyThreadB myThreadB = new MyThreadB();
        MyThreadC myThreadC = new MyThreadC();

        myThreadB.setPriority(Thread.MAX_PRIORITY);
        myThreadC.setPriority(9);

        myThreadB.start();
        myThreadC.start();
    }
}

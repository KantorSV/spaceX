package com.app;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyData myData = new MyData();

        IncrementThread incrementThread = new IncrementThread(myData);
        DecrementThread decrementThread = new DecrementThread(myData);

        incrementThread.start();
        decrementThread.start();

        incrementThread.join();
        decrementThread.join();

        System.out.println(myData);
    }

}

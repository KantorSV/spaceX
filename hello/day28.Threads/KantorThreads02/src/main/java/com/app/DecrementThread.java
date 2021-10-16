package com.app;

public class DecrementThread extends Thread {

    private MyData myData;

    public DecrementThread(MyData myData) {
        this.myData = myData;
    }

    public void run(){

        for (int i = 0; i < 10000; i++){
            myData.decrement();
        }
    }
}

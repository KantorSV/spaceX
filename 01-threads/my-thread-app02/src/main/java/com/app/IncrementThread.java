package com.app;

public class IncrementThread extends Thread {
    private MyData myData;

    public IncrementThread(MyData myData) {
        this.myData = myData;
    }

    public void run(){
        for(int i=0;i<9000000;i++){
            myData.increment();
        }
    }
}

package com.app;

public class DecrementThread extends Thread {
    private MyData myData;

    public DecrementThread(MyData myData) {
        this.myData = myData;
    }

    public void run(){
        for(int i=0;i<9000000;i++){
            myData.decrement();
        }
    }
}

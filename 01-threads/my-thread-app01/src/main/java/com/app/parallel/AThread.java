package com.app.parallel;

public class AThread extends Thread {
    private UserA userA;

    public AThread(UserA userA) {
        this.userA = userA;
    }

    public void run(){
        userA.a();
    }


}

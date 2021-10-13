package com.app.parallel;

public class BThread extends Thread {
    private UserB userB;

    public BThread(UserB userB) {
        this.userB = userB;
    }

    public void run(){
        userB.b();
    }
}

package com.app.synch;

public class CarB {

    public void b(){

        System.out.println("b begin; time = " + System.currentTimeMillis());
        Helper.pause(8000);
        System.out.println("b end; time = " + System.currentTimeMillis());
    }
}

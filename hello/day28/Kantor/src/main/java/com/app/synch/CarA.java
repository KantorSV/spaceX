package com.app.synch;

public class CarA {

    public void a (){

        System.out.println("a begin; time = " + System.currentTimeMillis());
        Helper.pause(5000);
        System.out.println("a end; time = " + System.currentTimeMillis());
    }

}

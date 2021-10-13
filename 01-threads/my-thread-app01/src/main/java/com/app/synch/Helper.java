package com.app.synch;

public class Helper {

    public static void pause(long delay){
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis()-start<delay){
        }
    }

}

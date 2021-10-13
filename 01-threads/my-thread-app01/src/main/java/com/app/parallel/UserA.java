package com.app.parallel;

import com.app.synch.Helper;

public class UserA {

    public void a(){
        System.out.println("a begin; time="+System.currentTimeMillis());
        Helper.pause(5000);
        System.out.println("a end; time="+System.currentTimeMillis());
    }

}

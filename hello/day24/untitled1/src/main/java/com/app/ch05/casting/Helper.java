package com.app.ch05.casting;

public class Helper {

    public static void doAction(Child child){
        System.out.println("helper.doAction().start()");
        child.speak();
        System.out.println("helper.doAction().end()");
    }

}

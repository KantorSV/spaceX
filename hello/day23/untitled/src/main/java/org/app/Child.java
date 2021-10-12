package org.app;

public class Child extends Parent {

    @Override
    public void doAction() {
        System.out.println("Child");
    }

    public void jump(){
        System.out.println("jump");
    }
}

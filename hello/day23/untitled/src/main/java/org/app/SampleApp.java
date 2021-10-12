package org.app;

public class SampleApp {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Child();
        parent.doAction();
        child.jump();
    }
}

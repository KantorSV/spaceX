package com.app;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        p1 = null;
        if(p1!=null) {
            p1.setAge(10);
        }

    }

}

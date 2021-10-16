package com.app01;

public class Main01 {

    public static void main(String[] args) {

        System.out.println("Main Begin");

        MyThreadA myThreadA = new MyThreadA();
        myThreadA.setName("Serhii");
        myThreadA.start();

        System.out.println("Main End");
    }
}

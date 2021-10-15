package com.app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main----@BEGIN");

        MyThreadA myThreadA = new MyThreadA();
        myThreadA.setName("Sergii");
       // myThreadA.setDaemon(true);
        myThreadA.start();

        System.out.println("Main----@END");
    }

}

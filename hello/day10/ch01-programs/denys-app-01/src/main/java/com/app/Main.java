package com.app;

public class Main {

    public static void main(String[] args) {
        //Phone phone = new Phone();
        SonyPhony sonyPhony = new SonyPhony();
        sonyPhony.makeCall();

        System.out.println("-------------------");
        MotorolaPhone motorolaPhone = new MotorolaPhone();
        motorolaPhone.makeCall();
    }

}

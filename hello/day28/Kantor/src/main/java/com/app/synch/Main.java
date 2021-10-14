package com.app.synch;

public class Main {
    public static void main(String[] args) {

        CarA carA = new CarA();
        CarB carB = new CarB();

        long start = System.currentTimeMillis();
        System.out.println("--------------start---------------");
        carA.a();
        carB.b();
        System.out.println("--------------finish--------------");
        long time = System.currentTimeMillis() - start;
        System.out.println("total time = " + time);
    }
}

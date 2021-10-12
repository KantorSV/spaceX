package com.app;

public class Calculator {
    public void add() {
        System.out.println("add");

    }

    public void add2(int a) {
        System.out.println("a = " + a);

    }

    public int add3(int a) {
        System.out.println("add3.a = " + a);
        int nnn = a * 3;
        return nnn;
    }

    public int add4(int a) {
        System.out.println("add4.a="+a);
        int nnn = 0;
        if (a == 1) {
            nnn=21;
        } else if (a == 0) {
            nnn = 1000;
        } else if (a < 0) {
            nnn = -5;
        } else {
            nnn = 7;
        }
        return nnn;
    }

}

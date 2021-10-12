package com.org;

import com.app.Calculator;

public class Computer {
    public static void main(String[] args) {
        Calculator ttt = new Calculator();
        ttt.add();
        int a = 55;
        ttt.add2(a);
        System.out.println("----------------------");
        ttt.add3(a);
        System.out.println("----------------------");
        int nnn = ttt.add3(a);
        System.out.println("sum =" + nnn);
        System.out.println("------------------------");
        nnn = ttt.add4(1);
        System.out.println("nnn="+nnn);
        System.out.println("------------------------");
        nnn = ttt.add4(0);
        System.out.println("nnn="+nnn);
        System.out.println("------------------------");
        nnn = ttt.add4(-5);
        System.out.println("nnn="+nnn);
    }
}

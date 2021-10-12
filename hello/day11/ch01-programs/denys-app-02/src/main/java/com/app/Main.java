package com.app;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new ChildGoodCalculator();
        int res= calculator.add(100,200);
        System.out.println("res="+res);


    }
}

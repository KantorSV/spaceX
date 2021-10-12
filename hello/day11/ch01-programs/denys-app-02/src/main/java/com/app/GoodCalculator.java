package com.app;

public class GoodCalculator implements Calculator{
    @Override
    public int add(int a, int b) {
        System.out.println("\t------good calculator add(). start-------------");
        System.out.println("\t------good calculator add(). finish-------------");
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int devide(int a, int b) {
        return a/b;
    }
}

package com.app;

public class BadCalculator implements Calculator{

    @Override
    public int add(int a, int b) {
        return -100;
    }

    @Override
    public int subtract(int a, int b) {
        return 500;
    }

    @Override
    public int multiply(int a, int b) {
        return 700;
    }

    @Override
    public int devide(int a, int b) {
        return 900;
    }
}

package com.app;

public class Calculator {

    public void add(int a, int b){
        int sum = a+b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("sum="+sum);
    }

    public int addWithReturn(int a, int b){
        int sum = a+b;
        return sum;
    }

    public boolean isDenys(String name){
        boolean res = "Denys".equals(name);
        return res;
    }

    public void isBoris(String name){
        boolean res = "Denys".equals(name);
    }

}


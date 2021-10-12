package com.app;

public class ChildGoodCalculator extends  GoodCalculator {

    public int add(int a, int b){
        System.out.println("------ChildGood calculator add(). start-------------");
        //super.add(a, b);
        System.out.println("------ChildGood calculator add(). finish-------------");
        return a+b;
    }

}

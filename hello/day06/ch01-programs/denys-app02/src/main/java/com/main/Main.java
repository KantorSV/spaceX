package com.main;

import com.app.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 3;
        calculator.add(a, b);
        System.out.println("---------------------");


        int res = calculator.addWithReturn(a, b);
        if (res > 0) {
            System.out.println("Positive");
        } else if (res == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("NEGATIVE");
        }

        //System.out.println("res="+res);

        String name = "Denys";
        boolean result = calculator.isDenys(name);
        System.out.println("result=" + result);
        //boolean res = calculator.isBoris(name);
    }
}

package com.app;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Calculator calc1 = new Calculator();
        int z = calc1.add(1, 2);

        System.out.println("a + b = " + z);
        System.out.println("------------");

        Calculator calc2 = new Calculator();
        int x = calc2.subtract(1, 2);

        System.out.println("a - b = " + x);
        System.out.println("------------");

        Calculator calc3 = new Calculator();
        int c = calc3.multiply(1, 2);

        System.out.println("a * b = " + c);
        System.out.println("------------");

        Calculator calc4 = new Calculator();
        int v = calc4.devide(1, 2);

        System.out.println("a / b = " + v);
        System.out.println("------------");
    }

}

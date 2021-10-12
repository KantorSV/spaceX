package com.app;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        byte v1 = 0;
        short v2 = 1;
        int v3 = 2;
        long v4 = 3;
        float v5 = 4;
        double v6 = 5;

        Byte z1 = 00;
        Short z2 = 10;
        Integer z3 = 20;
        Long z4 = 30l;
        Float z5 = 40f;
        Double z6 = 50d;

        main.doAction(v5, v6);
        main.doActionObject(z3, z4);
    }

    public void doAction(float a, double b) {
        System.out.println("a = " + a + "\nb = " + b);
    }

    public void doActionObject(Integer a, Long b){
        System.out.println("-----------------");
        System.out.println("a = " + a + "\nb = " + b);
    }

}

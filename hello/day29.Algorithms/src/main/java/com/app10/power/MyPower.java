package com.app10.power;

public class MyPower {

    public int power(int a, int n) {

        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;

    }

}
